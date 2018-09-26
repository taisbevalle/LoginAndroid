package e.taisbedendovalle.sistemaacademico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser user;
    private TextView Email;
    private Button espacoAluno;
    private Button financeiro;
    private Button meusCursos;
    private Button notas;
    private Button calendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Email = (TextView)findViewById(R.id.profileEmail);
        mAuth = FirebaseAuth.getInstance();
        espacoAluno = (Button)findViewById(R.id.espaco_aluno);
        financeiro = (Button)findViewById(R.id.financeiro);
        meusCursos = (Button)findViewById(R.id.meus_cursos);
        notas = (Button)findViewById(R.id.notas);
        calendario = (Button)findViewById(R.id.calendario);
        user = mAuth.getCurrentUser();

        if (user != null){
            String email = user.getEmail();
            Email.setText(email);
        }
    }
}
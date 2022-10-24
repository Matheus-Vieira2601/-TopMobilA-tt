package br.unicamp.topmobil;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Cadastro extends AppCompatActivity
{
    EditText edtNome, edtTelefone,edtEmail, edtSenha;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        edtNome = findViewById(R.id.edtNome);
        edtTelefone = findViewById(R.id.edtEmail);
        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);

        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrarUsuario();
            }});
    }

    private void cadastrarUsuario()
    {
        String strNome = edtNome.getText().toString();
        String strTelefone = edtTelefone.getText().toString();
        String strEmail = edtEmail.getText().toString();
        String strSenha = edtSenha.getText().toString();


        if(email(strEmail)  == true && nome(strNome) == true && senha(strEmail) == true && telefone(strTelefone) == true)
        {
            Service service = new Service(strNome, strEmail, strTelefone, strSenha); // tá dando pau pq la pede id
            RotasUsuarios rotas = RetrofitConfig.getRetrofitInstance().create(RotasUsuarios.class); // chamamos a classe service - Service service
            Call<Service> call = rotas.inserirCliente(service);
            call.enqueue(new Callback<Service>()
            {
                @Override
                public void onResponse(Call<Service> call, Response<Service> response)
                {
                    if(response.isSuccessful())
                    {
                        Service resposta = response.body(); //recebe o body inteiro do dog

                        edtNome.setText(resposta.getNome().toString());
                        edtTelefone.setText(resposta.getTelefone().toString());
                        edtEmail.setText(resposta.getEmail().toString());
                        edtSenha.setText(resposta.getSenha().toString());
                    }
                    else {
                        Toast.makeText(Cadastro.this, "Erro na consulta!", Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<Service> call, Throwable t)
                {
                    Toast.makeText(Cadastro.this, "Ocorreu erro de requisição do:" + t.toString(), Toast.LENGTH_LONG).show();
                }
            });
            // talvez dê para remover essa parte
        }
    }

    private boolean nome(String nome)
    {
        if(nome.equals(""))
        {
            Toast.makeText(Cadastro.this, "O campo nome está vazio", Toast.LENGTH_LONG).show();
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean email(String email)
    {
        if(email.equals(""))
        {
            Toast.makeText(Cadastro.this, "O campo email está vazio", Toast.LENGTH_LONG).show();
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean telefone(String telefone)
    {
        if(edtTelefone.equals(""))
        {
            Toast.makeText(Cadastro.this, "O campo telefone está vazio", Toast.LENGTH_LONG).show();
            return false;
        }

        else
        {
            return true;
        }
    }

    private boolean senha(String senha)
    {
        if (senha.equals(""))
        {
            Toast.makeText(Cadastro.this, "O campo senha está vazio", Toast.LENGTH_LONG).show();
            return false;
        }
        else
        {
            return true;
        }
    }
}
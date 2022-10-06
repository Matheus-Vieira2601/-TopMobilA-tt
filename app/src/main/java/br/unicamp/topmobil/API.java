package br.unicamp.topmobil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class API extends AppCompatActivity {

    private Button btnApi;
    private TextView tvApi;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        btnApi = findViewById(R.id.btnApi);
        tvApi = findViewById(R.id.tvApi);

        btnApi.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Tarefa tarefa = new Tarefa();
                tarefa.execute("https://app.swaggerhub.com/apis/douglasrc/api-carros/1.0.1#/");
            }
        });
    }

    private class Tarefa extends AsyncTask<String, String, String>
    {
        @Override

        protected String doInBackground(String... strings) {
            String retorno = Conexao.getDados(strings[0]);
            return retorno;
        }

        @Override

        protected void onPostExecute(String s) {
            tvApi.setText(s);
        }
    }

}
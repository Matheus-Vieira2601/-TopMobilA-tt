package br.unicamp.topmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Usuarios extends AppCompatActivity {

    Button btnLoign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoign.findViewById(R.id.btnLogin);

        btnLoign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login_Usuarios.this, activity_menu.class);

                startActivity(intent);

            }
        });
    }
}
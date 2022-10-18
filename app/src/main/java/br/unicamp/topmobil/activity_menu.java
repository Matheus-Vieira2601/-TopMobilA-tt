package br.unicamp.topmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_menu extends AppCompatActivity {

    Button btnComprar, btnVender, btnAlugar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnComprar.findViewById(R.id.btnComprar);
        btnVender.findViewById(R.id.btnComprar);
        btnAlugar.findViewById(R.id.btnAlugar);


        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, compra_carros.class);

            }
        });

        btnAlugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, activity_aluguel_carros.class);

            }
        });

        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, Cadastro_Carros.class);

            }
        });



    }
}
package br.unicamp.topmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class activity_menu extends AppCompatActivity {

    Button btnComprar, btnVender, btnAlugar;
    ImageView ImgUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnComprar.findViewById(R.id.btnComprar);
        btnVender.findViewById(R.id.btnComprar);
        btnAlugar.findViewById(R.id.btnAlugar);
        ImgUsuario.findViewById(R.id.ImgUsuario);


        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, compra_carros.class);

                startActivity(intent);

            }
        });

        btnAlugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, activity_aluguel_carros.class);

                startActivity(intent);

            }
        });

        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this, Cadastro_Carros.class);

                startActivity(intent);

            }
        });

        ImgUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }



}
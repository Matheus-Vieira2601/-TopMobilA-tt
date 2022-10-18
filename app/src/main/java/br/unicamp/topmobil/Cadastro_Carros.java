package br.unicamp.topmobil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro_Carros extends AppCompatActivity {

    Button btnPorAVenda;

    private Uri mSelectedUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_carros);

        btnPorAVenda.findViewById(R.id.btnPorAVenda);

        btnPorAVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Cadastro_Carros.this, activity_menu.class);

                startActivity(intent);

            }
        });
    }

    private void selectPhoto()
    {
       Intent intent = new Intent(Intent.ACTION_PICK);
       intent.setType("image/*");
       startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0)
        {
            mSelectedUri = data.getData();
        }
    }
}
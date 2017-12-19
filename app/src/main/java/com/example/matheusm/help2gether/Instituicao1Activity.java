package com.example.matheusm.help2gether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instituicao1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao1);

        Button voltar = (Button) findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(Instituicao1Activity.this, InstituicaoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

    }
}
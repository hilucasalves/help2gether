package com.example.matheusm.help2gether;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class InstituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao);

        ImageView instituicao1 = (ImageView) findViewById(R.id.i1);
        ImageView instituicao2 = (ImageView) findViewById(R.id.i2);
        Button voltar = (Button) findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(InstituicaoActivity.this, MenuActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

        instituicao1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(InstituicaoActivity.this, Instituicao1Activity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

        instituicao2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(InstituicaoActivity.this, Instituicao2Activity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

    }
}

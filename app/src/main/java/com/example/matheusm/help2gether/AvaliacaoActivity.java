package com.example.matheusm.help2gether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvaliacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

        Button voltar = (Button) findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(AvaliacaoActivity.this, MenuActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });
    }
}
package com.example.matheusm.help2gether;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        TextView evento1 = (TextView) findViewById(R.id.e1);
        TextView evento2 = (TextView) findViewById(R.id.e2);
        Button voltar = (Button) findViewById(R.id.voltar);

        evento1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(EventoActivity.this, Evento1Activity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });

        evento2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(EventoActivity.this, Evento2Activity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(EventoActivity.this, MenuActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });
    }
}
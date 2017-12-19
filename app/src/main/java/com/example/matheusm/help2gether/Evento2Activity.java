package com.example.matheusm.help2gether;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Evento2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento2);

        Button participa = (Button) findViewById(R.id.participa);
        Button voltar = (Button) findViewById(R.id.voltar);

        participa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Obrigado por participar!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent chamarTermo = new Intent(Evento2Activity.this, EventoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(Evento2Activity.this, EventoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });
    }
}

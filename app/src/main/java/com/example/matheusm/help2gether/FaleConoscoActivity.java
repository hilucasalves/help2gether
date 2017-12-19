package com.example.matheusm.help2gether;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FaleConoscoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fale_conosco);

        final EditText faleconosco = (EditText) findViewById(R.id.faleconosco);
        Button enviar = (Button) findViewById(R.id.salvar);
        Button voltar = (Button) findViewById(R.id.voltar);

        enviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                faleconosco.setText("");

                Context context = getApplicationContext();
                CharSequence text = "Obrigado por participar!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent chamarTermo = new Intent(FaleConoscoActivity.this, MenuActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chamarTermo = new Intent(FaleConoscoActivity.this, MenuActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }
        });
    }


}

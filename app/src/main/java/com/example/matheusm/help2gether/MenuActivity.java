package com.example.matheusm.help2gether;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton editaPerfil = (ImageButton) findViewById(R.id.buttonperfil);
        ImageButton instituicao = (ImageButton) findViewById(R.id.buttoninstituicao);
        ImageButton evento = (ImageButton) findViewById(R.id.buttonevento);
        ImageButton avaliacao = (ImageButton) findViewById(R.id.buttonavaliacao);
        ImageButton faleConosco = (ImageButton) findViewById(R.id.buttonfaleconosco);

        editaPerfil.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(MenuActivity.this, CadastroActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);

            }

        });

        instituicao.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(MenuActivity.this, InstituicaoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

        evento.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(MenuActivity.this, EventoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

        avaliacao.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(MenuActivity.this, AvaliacaoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });

        faleConosco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent chamarTermo = new Intent(MenuActivity.this, FaleConoscoActivity.class);//Atraves do intent sera chamado a nova tela.
                startActivity(chamarTermo);
            }

        });
    }
}
package com.example.matheusm.help2gether;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class CadastroActivity extends AppCompatActivity {
    private Button Salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView Textcidade = (AutoCompleteTextView) findViewById(R.id.cidade);
        // Get the string array
        String[] cidade = getResources().getStringArray(R.array.cidade);
        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cidade);
        Textcidade.setAdapter(adapter);

        Salvar = (Button) findViewById(R.id.Salvar);

        Salvar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Perfil salvo.";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                finish();
                CadastroActivity.super.onBackPressed();
            }

        });
    }
}
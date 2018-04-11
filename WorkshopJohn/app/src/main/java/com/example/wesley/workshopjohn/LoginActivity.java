package com.example.wesley.workshopjohn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Definir
    EditText senha;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Referenciar
        botao = (Button) findViewById(R.id.button2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senha = (EditText) findViewById(R.id.editText3);

                if(senha.getText().toString().equals("a"))
                {
                    Toast.makeText(getApplicationContext(), "Senha Correta", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Senha Incorreta", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}



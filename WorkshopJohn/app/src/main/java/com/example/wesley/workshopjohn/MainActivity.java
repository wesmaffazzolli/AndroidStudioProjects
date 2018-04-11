package com.example.wesley.workshopjohn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Define
    Button botao;
    TextView texto;
    EditText campo1, campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia
        botao = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        campo1 = (EditText) findViewById(R.id.editText);
        campo2 = (EditText) findViewById(R.id.editText2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer result;
                String resultado;
                String meliante = " meliante(s)!!!";
                //String mensagem1 = campo1.getText().toString();
                Integer valorCampo1Integer = Integer.parseInt(campo1.getText().toString());
                Integer valorCampo2Integer = Integer.parseInt(campo2.getText().toString());
                result = valorCampo1Integer + valorCampo2Integer;
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                resultado = result.toString();
                texto.setText(resultado + meliante);
            }
        });
        QueroIbagens();
    }

    public void QueroIbagens(){
        Log.i("LOG:", "BI DA IBAGENS NA TELA!");
    }
}

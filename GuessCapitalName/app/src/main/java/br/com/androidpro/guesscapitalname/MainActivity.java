package br.com.androidpro.guesscapitalname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Map<String,String> map = new HashMap<String,String>();
    int num;
    Random r;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map.put("Manaus", new String("Amazonas"));
        map.put("Belém", new String("Pará"));
        map.put("Maceió", new String("Alagoas"));
        map.put("Recife", new String("Pernambuco"));
        map.put("Natal", new String("Rio Grande do Norte"));

        r = new Random();
        num = r.nextInt(5);
    }

    public void guess(View view) {
        TextView estado = (TextView)findViewById(R.id.estado);
        TextView mensagem = (TextView)findViewById(R.id.mensagem);
        EditText cidade = (EditText)findViewById(R.id.cidade);

        Object keyEscolhida = map.get(num);


        if(cidade.length() == 0) {
            Toast msg = Toast.makeText(this, "Digite o nome da cidade!", Toast.LENGTH_LONG);
            msg.show();
        } else {
            if(map.containsKey(cidade) && cidade.equals(map.get(cidade))) {
                msg = "Você acertou! :D";
            } else {
                msg = "Você errou! Tente novamente."
            }
        }
    }
}

package br.com.androidpro.drinkmixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int drinkId = 3;
        Intent it = getIntent();
        String[] drinks = new String[]{"Batida de Sonho de Valsa", "Drink dos Deuses", "Quentão"};
        String[] ingredients = new String[]{"3 bombons Sonho de Valsa \n" +
                "1 lata de leite condensado \n" +
                "1/2 garrafa de Pinga \n" +
                "1 latinha de Guaraná",
        "1 vidro 100ml de leite de coco \n" +
        "1 copo 100ml de suco de maracujá \n " +
        "1 copo 100ml de groselha",
        "1 garrafa de cachaça \n" +
        "600ml de água \n" +
        "1/2Kg de açúcar"};

        EditText drinkName = (EditText)findViewById(R.id.drinkName);
        EditText ingBox = (EditText)findViewById(R.id.ingEditText);

        if(it != null){
            drinkId = it.getIntExtra("drinkId", 3);
        }

        if(drinkId == 3) {
            drinkName.setText("");
            ingBox.setText("");
            Toast.makeText(this, "Drink não encontrado ", Toast.LENGTH_LONG).show();
        } else {
            drinkName.setText(drinks[drinkId]);
            ingBox.setText(ingredients[drinkId]);
        }

    }
}

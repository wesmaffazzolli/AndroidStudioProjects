package br.com.androidpro.provaex2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MasterActivity extends AppCompatActivity {

    ListView list;
    String[] nome = {"Albert Einstein", "Nikola Tesla", "Alan Turing"};
    String[] partido ={"Partido dos Físicos","Partido Energético","Partido da Computação"};
    Integer[] imageId = {R.drawable.einstein, R.drawable.tesla, R.drawable.turing};
    int[] votos = {0,0,0};
    int javotou = 0; //0 = NÃO VOTOU / 1 = JÁ VOTOU

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        ListCell adapter = new ListCell(MasterActivity.this, nome, partido, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int arg2, long arg3) {

                Intent it = new Intent(MasterActivity.this, DetailActivity.class);
                Bundle params = new Bundle();
                int id = list.getId();
                Log.d("meuID", String.valueOf(id));

                params.putString("nome", nome[id]);
                params.putString("partido", partido[id]);
                params.putInt("votos", votos[id]);
                params.putInt("javotou", javotou);
                params.putInt("imagem", imageId[id]);

                it.putExtras(params);
                startActivity(it);
                //Toast.makeText(MasterActivity.this, "Clicou na " + nome[+arg2], Toast.LENGTH_SHORT).show();


            }
        });



    }
}

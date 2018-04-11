package br.com.androidpro.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] nome = {"Albert Einstein", "Nikola Tesla", "Alan Turing"};
    String[] partido ={"Partido dos Físicos","Partido Energético","Partido da Computação"};
    Integer[] imageId = {R.drawable.einstein, R.drawable.tesla, R.drawable.turing};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListCell adapter = new ListCell(MainActivity.this, nome, partido, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int arg2, long arg3) {
                Toast.makeText(MainActivity.this, "Clicou na " + nome[+arg2], Toast.LENGTH_SHORT).show();
            }
        });



    }
}

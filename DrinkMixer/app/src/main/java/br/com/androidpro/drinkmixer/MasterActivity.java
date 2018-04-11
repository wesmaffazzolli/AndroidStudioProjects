package br.com.androidpro.drinkmixer;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MasterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_master);

        String[] drinks = new String[]{"Batida de Sonho de Valsa", "Drink dos Deuses", "Quentão"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, drinks);
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, DetailActivity.class);
        it.putExtra("drinkId", position);
        startActivity(it);

        //Toast.makeText(this, "Selecionado " + item, Toast.LENGTH_SHORT).show();
    }
}

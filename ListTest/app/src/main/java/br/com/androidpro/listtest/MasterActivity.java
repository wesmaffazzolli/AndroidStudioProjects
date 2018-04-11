package br.com.androidpro.listtest;

import android.app.ListActivity;
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

        String[] itens = new String[]{"Item 1", "Item 2", "Item 3"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        setListAdapter(array);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //Pega o Item da posição
        Object obj = this.getListAdapter().getItem(position);
        String item = obj.toString();

        Toast.makeText(this, "Selecionado " + item, Toast.LENGTH_SHORT).show();
    }
}

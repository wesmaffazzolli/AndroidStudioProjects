package br.com.androidpro.provaex2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView nome, partido;
    ImageView foto;
    Button botaoVotar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nome = (TextView) findViewById(R.id.nomeDetail);
        partido = (TextView) findViewById(R.id.partidoDetail);
        foto = (ImageView) findViewById(R.id.candidatoImageDetail);

        Intent it = getIntent();
        if (it != null) {
            String meuNome = it.getStringArrayExtra("nome").toString();
            String meuPartido = it.getStringArrayExtra("partido").toString();
            int minhaFoto = it.getIntExtra("foto", 0);
            int numeroVoto = it.getIntExtra("votos", 0);
            int javotou = it.getIntExtra("javotou", 0);

            nome.setText(meuNome.toString());
            partido.setText(meuPartido.toString());
            foto.setImageResource(minhaFoto);

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

}

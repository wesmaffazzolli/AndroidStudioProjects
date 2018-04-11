package br.com.androidpro.multiview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityScreen2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView welcomeTextView = (TextView)findViewById(R.id.welcomeTextView);

        Intent it = getIntent();
        if(it != null) {
            /*Bundle params = it.getExtras();
            //Log.v("Params", "Passei aqui caraio :D e este é meu resultado: "+ params.getString("msg"));
            if(params != null) {
                String msg = params.getString("msg");
                Log.v("Params", msg.toString());
                welcomeTextView.setText("Welcome " + msg);
            }*/
            String msg = it.getStringExtra("msg");
            welcomeTextView.setText("Welcome " + msg);
        }
    }

    public void onClick(View view) {
        Intent it = new Intent(this, ActivityScreen1.class);
        startActivity(it);
        finish();

    }
}

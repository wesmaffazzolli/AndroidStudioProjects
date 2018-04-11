package br.com.androidpro.multiview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityScreen1 extends Activity {

    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        nameEditText = (EditText)findViewById(R.id.nameEditText);
        Button goToScreen2 = (Button)findViewById(R.id.goToScreen2Button);

        /*goToScreen2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("EditText", nameEditText.getText().toString());
                    }
                });*/
    }

    public void onClick(View view) {
        Intent it = new Intent(this, ActivityScreen2.class);

        Bundle params = new Bundle();
        Log.v("EditText", nameEditText.getText().toString());
        params.putString("msg", nameEditText.getText().toString());
        it.putExtras(it);

        /*Bundle newBundle = new Bundle();
        newBundle = it.getExtras();
        Log.v("ParamAntes", "Esta é o param antes de enviar: " + params.getString("msg"));*/
        startActivity(it);
    }
}

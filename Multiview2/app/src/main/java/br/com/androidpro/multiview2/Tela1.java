package br.com.androidpro.multiview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {

    EditText name, age, phone, password, login;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        name = (EditText)findViewById(R.id.nameEditText);
        age = (EditText)findViewById(R.id.ageEditText);
        phone = (EditText)findViewById(R.id.phoneEditText);
        password = (EditText)findViewById(R.id.passwordEditText);
        login = (EditText)findViewById(R.id.loginEditText);
        sendButton = (Button)findViewById(R.id.sendButton);

    }

    public void onClick(View view) {
        Intent it = new Intent(this, Tela2.class);
        Bundle params = new Bundle();

        params.putString("name", name.getText().toString());
        params.putString("age", String.valueOf(age.getText()));
        params.putString("phone", String.valueOf(phone.getText()));
        params.putString("password", password.getText().toString());
        params.putString("login", login.getText().toString());

        it.putExtras(params);
        startActivity(it);
    }

}

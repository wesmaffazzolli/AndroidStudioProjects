package br.com.androidpro.multiview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    TextView userName, userAge, userPhone, userPassword, userLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        userName = (TextView)findViewById(R.id.nameTextView);
        userAge = (TextView)findViewById(R.id.ageTextView);
        userPhone = (TextView)findViewById(R.id.phoneTextView);
        userPassword = (TextView)findViewById(R.id.passwordTextView);
        userLogin = (TextView)findViewById(R.id.loginTextView);

        Intent it = getIntent();
        if(it != null) {
            String name = it.getStringExtra("name");
            String age = it.getStringExtra("age");
            String phone = it.getStringExtra("phone");
            String login = it.getStringExtra("login");
            String password = it.getStringExtra("password");

            userName.setText("Name: " + name);
            userAge.setText("Age: " + age);
            userPhone.setText("Phone: " + phone);
            userPassword.setText("Password: " + password);
            userLogin.setText("Login: " + login);
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

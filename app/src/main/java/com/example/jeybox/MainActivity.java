package com.example.jeybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        configureNextTxtView();
        configureNextButton();
    }

//   Navigation vers forgot_password
    private void configureNextTxtView(){
        TextView nextTxtView = (TextView) findViewById(R.id.lblForgot);
        nextTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ForgotPassword.class));
            }
        });
    }

    //   Navigation vers page d'accueil
    // TODO Check entry before navigation
    private void configureNextButton(){
        Button nextButton = (Button) findViewById(R.id.btnLog);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Accueil.class));
            }
        });
    }
}

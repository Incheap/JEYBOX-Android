package com.example.jeybox;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.GenericArrayType;

public class ConsulterArticle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulter_article);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spinnerValues));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        configureSelectedRow();
        configureBackButton();
        configureNotifButton();

    }

    //Set background of selected row to know which one is active
    private void configureSelectedRow(){
        final TextView test1 = (TextView) findViewById(R.id.lblArticle0);
        final TextView test2 = (TextView) findViewById(R.id.lblArticle1);
        final TextView test3 = (TextView) findViewById(R.id.lblArticle2);

        test1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test1.setBackgroundColor(Color.CYAN);
                test2.setBackgroundColor(Color.WHITE);
                test3.setBackgroundColor(Color.WHITE);
            }
        });

        test2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test1.setBackgroundColor(Color.WHITE);
                test2.setBackgroundColor(Color.CYAN);
                test3.setBackgroundColor(Color.WHITE);
            }
        });

        test3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test1.setBackgroundColor(Color.WHITE);
                test2.setBackgroundColor(Color.WHITE);
                test3.setBackgroundColor(Color.CYAN);
            }
        });

    }

    //Navigate to a basic notif UI
    private void configureNotifButton() {
        //  Navigation vers page de notifications
            Button notifButton = (Button) findViewById(R.id.btnNotif);
            notifButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ConsulterArticle.this, Notification.class));
                }
            });
        }

    //Navigate back to accueil
    private void configureBackButton(){
        Button backButton = (Button) findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}

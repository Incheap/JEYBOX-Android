package com.example.jeybox;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

/****************************************
 Fichier :          Notification.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe qui crée et affiche une notification.
 Date :             2020/05/11

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/

public class Notification extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        Button btnCreateNotif = findViewById(R.id.btnNotification);

        btnCreateNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNotification();
            }
        });
    }
        //Creates and display a notification
        private void addNotification() {
            //Building notification
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                    .setSmallIcon(R.mipmap.ic_launcher_round)
                    .setContentTitle("JEYBOX")
                    .setContentText("Un article que vous désirez est disponible !");

            //Intent showing the notification
            Intent notificationIntent = new Intent(this, Notification.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this,0, notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(contentIntent);

            //Add as notification
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());

            Toast.makeText(this, "Notification envoyée", Toast.LENGTH_LONG).show();
        }
}

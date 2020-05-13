/****************************************
 Fichier :          ForgotPassword.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe lié à un UI qui contrôle les réactions de celle-ci.
 Date :             2020/05/06

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.example.jeybox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
        findViewById(R.id.lblError).setVisibility(View.INVISIBLE);

        configureSendButton();

    }

    private void configureSendButton() {
        Button send = (Button) findViewById(R.id.btnSend);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    EditText pass1 = (EditText) findViewById(R.id.txtNewPass);
                    EditText pass2 = (EditText) findViewById(R.id.txtConfirmPass);
                    EditText mail = (EditText) findViewById(R.id.txtMail);

                    if( pass1.getText().toString().equals("") || pass2.getText().toString().equals("") || mail.getText().toString().equals("")){
                        Toast.makeText( ForgotPassword.this, "Veuillez remplir tous les champs", Toast.LENGTH_LONG).show();
                        return;
                }

                    if(pass1.getText().toString().equals(pass2.getText().toString())){
                        /* TODO
                         *   Change password in bd where email = mail.getText().tostring()*/
                        Toast.makeText( ForgotPassword.this, "Courriel envoyé", Toast.LENGTH_LONG).show();
                        //Validate password entry
                        finish();
                    }
                    else{
                        TextView error = (TextView) findViewById(R.id.lblError);
                        pass1.setText("");
                        pass2.setText("");
                        error.setVisibility(View.VISIBLE);
                    }
            }
        });

    }

}

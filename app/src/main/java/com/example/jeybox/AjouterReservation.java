package com.example.jeybox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class AjouterReservation extends AppCompatActivity {

//    private SectionStatePagerAdapter mSectionStatePagerAdapter;
//    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajouter_reservation);

//        mSectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
//
//        mViewPager = (ViewPager) findViewById(R.id.container);
//        setUpViewPager(mViewPager);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        configureBackButton();
        configureAddButton();
        configureSwitchButton();

    }

    private void configureSwitchButton() {
        Switch SuppSwitch = (Switch) findViewById(R.id.swcSup);
        SuppSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AjouterReservation.this, SupprimerReservation.class));
            }
        });
    }

    private void configureAddButton(){
        Button addButton = (Button) findViewById(R.id.btnOk);
        final EditText name = (EditText) findViewById(R.id.txtClient);
        final EditText article = (EditText) findViewById(R.id.txtArticleID);
        final EditText nb = (EditText) findViewById(R.id.txtNombre);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("") || article.getText().toString().equals("") || nb.getText().toString().equals("")){
                    Toast.makeText( AjouterReservation.this, "Veuillez remplir tous les champs", Toast.LENGTH_LONG).show();
                    return;
                }

                /* TODO
                *   Add reservation into the table with SQL*/

                Toast.makeText( AjouterReservation.this, "Votre réservation a bien été sauvegardée", Toast.LENGTH_LONG).show();
                name.setText("");
                article.setText("");
                nb.setText("");
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

//    private void setUpViewPager(ViewPager viewPager){
//        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new SupprimerReservation(), "supprimer_reservation");
//        adapter.addFragment(new FragmentRes(), "ajouter_reservation");
//        viewPager.setAdapter(adapter);
//    }

//    public void setViewPager(int fragmentNumber){
//        mViewPager.setCurrentItem(fragmentNumber);
//    }


}

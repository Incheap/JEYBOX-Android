package com.example.jeybox;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SupprimerReservation extends Fragment {
    private Switch swSupp;
    private Switch swAjout;
    //private Button btnOk;
    private Button btnBack;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ajouter_reservation, container, false);

        swSupp = (Switch) view.findViewById(R.id.swcSup);
        swAjout = (Switch) view.findViewById(R.id.swcAj);
        //btnOk = (Button) view.findViewById(R.id.btnOk);
        btnBack = (Button) view.findViewById(R.id.btnBack);

        swSupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Page de suppression", Toast.LENGTH_SHORT).show();
                ((Accueil) getActivity()).setViewPager(1);
            }
        });

        swAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Page d'ajout'", Toast.LENGTH_SHORT).show();
                ((Accueil) getActivity()).setViewPager(0);
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Accueil.class);
                //Navigate back to accueil
            }
        });

        return view;
    }
}

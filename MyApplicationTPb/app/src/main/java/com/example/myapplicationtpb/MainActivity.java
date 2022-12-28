package com.example.myapplicationtpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int compteurCroissant = 0;
    private int compteurChocolat = 0;
    private int compteurChocolatine = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textViewCroissant = findViewById(R.id.textViewCroisant);
        TextView textViewChocolat = findViewById(R.id.textViewChocolat);
        TextView textViewChocolatine = findViewById(R.id.textViewChocolatine);

        ImageView imageViewCroissant = findViewById(R.id.imageViewCroissant);
        ImageView imageViewChocolat = findViewById(R.id.imageViewChocolat);
        ImageView imageViewChocolatine = findViewById(R.id.imageViewChocolatine);

        textViewCroissant.setText("Croissants : "+ compteurCroissant);
        textViewChocolat.setText("Barres de chocolat : "+ compteurChocolat);
        textViewChocolatine.setText("Chocolatines : "+ compteurChocolatine);


        imageViewCroissant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteurCroissant ++;
                textViewCroissant.setText("Croissants : " + Integer.toString(compteurCroissant));
            }
        });


        imageViewChocolat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteurChocolat ++;
                textViewChocolat.setText("Barres de chocolat : " + Integer.toString(compteurChocolat));
            }
        });


        imageViewChocolatine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(compteurCroissant > compteurChocolat || (compteurCroissant == 0 && compteurChocolat == 0) || (compteurCroissant < compteurChocolat)){
                    Toast.makeText(getApplicationContext(),"Pas assez de matière première !",Toast.LENGTH_SHORT).show();
                }
                if ((compteurChocolat < compteurCroissant) || (compteurCroissant != 1) || (compteurChocolat > compteurCroissant)){
                        int temp = nbChocolatines(compteurCroissant, compteurChocolat);

                            for(int i = temp; i > 0; i--) {
                                if (compteurCroissant > 0 && compteurChocolat > 0) {
                                    compteurChocolatine++;
                                    compteurCroissant--;
                                    compteurChocolat = compteurChocolat - 2;

                                    textViewCroissant.setText("Croissants : " + Integer.toString(compteurCroissant));
                                    textViewChocolat.setText("Barres de chocolat : " + Integer.toString(compteurChocolat));
                                    textViewChocolatine.setText("Chocoloatines : " + Integer.toString(compteurChocolatine));
                                }
                            }
                    } else {
                        Toast.makeText(getApplicationContext(),"Pas assez de matière première !",Toast.LENGTH_SHORT).show();
                    }
            }
        });

    }

    public int nbChocolatines(int compteurCroissant, int compteurChocolat){
        int temp=0;

        while((compteurCroissant < compteurChocolat) || (compteurCroissant > compteurChocolat) || (compteurCroissant == compteurChocolat)){
            if(compteurChocolat > 1){
                temp = compteurChocolat / 2;
                return temp;
            }

            if (compteurCroissant > 0){
                 int temp2 = temp - compteurCroissant;
                return temp2;
            }
            return temp;
       }
        return temp;
    }
}
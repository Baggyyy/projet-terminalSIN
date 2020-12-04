package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page3 extends AppCompatActivity {

    private Button mvolets;
    private Button mpanneau;
    private Button meclairage;
    private Button malarme;
    private Button mretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        mvolets=(Button) findViewById(R.id.volets);
        mpanneau=(Button) findViewById(R.id.panneau);
        meclairage=(Button) findViewById(R.id.eclairage);
        malarme=(Button) findViewById(R.id.alarme);
        mretour=(Button) findViewById(R.id.retour);

        mvolets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page4=new Intent(Page3.this,com.example.mathieu.projetsin.Page4.class);
                startActivity(Page4);

            }
        });

        mpanneau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page5=new Intent(Page3.this,com.example.mathieu.projetsin.Page5.class);
                startActivity(Page5);

            }
        });

        meclairage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page6=new Intent(Page3.this,com.example.mathieu.projetsin.Page6.class);
                startActivity(Page6);

            }
        });

        malarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page7=new Intent(Page3.this,com.example.mathieu.projetsin.Page7.class);
                startActivity(Page7);

            }
        });
        mretour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2=new Intent(Page3.this,Page2.class);
                startActivity(Page2);

            }
        });
    }
}

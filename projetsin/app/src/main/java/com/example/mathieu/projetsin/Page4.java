package com.example.mathieu.projetsin;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page4 extends AppCompatActivity {

    private Button mretour2;
    private Button mouvrir_volets;
    private Button mfermer_volets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);


        mretour2=(Button) findViewById(R.id.retour2);
        mouvrir_volets=(Button) findViewById(R.id.ouvrir_volets);
        mfermer_volets=(Button) findViewById(R.id.fermer_volets);


        mretour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page3=new Intent(Page4.this,Page3.class);
                startActivity(Page3);

            }
        });
        mouvrir_volets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login.getIPandPort();
                Login.CMD = "0";
                Login.Socket_AsyncTask cmd_ouvrir_volets = new Login.Socket_AsyncTask();
                cmd_ouvrir_volets.execute();

            }
        });
        mfermer_volets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login.getIPandPort();
                Login.CMD = "1";
                Login.Socket_AsyncTask cmd_fermer_volets = new Login.Socket_AsyncTask();
                cmd_fermer_volets.execute();



            }
        });

    }



}

package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page7 extends AppCompatActivity {

    private Button mretour5;
    private Button mactiver_alarme;
    private Button mdesactiver_alarme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        mretour5=(Button) findViewById(R.id.retour5);
        mactiver_alarme=(Button)findViewById(R.id.activer_alarme); //initialise le bouton activer l'alarme
        mdesactiver_alarme=(Button)findViewById(R.id.desactiver_alarme);

        mretour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page3=new Intent(Page7.this, Page3.class);
                startActivity(Page3);
            }
        });
        mactiver_alarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login.getIPandPort(); //Appelle la méthode getIPandPort de la classe Login
                Login.CMD="2"; //Définis la data à envoyer au serveur
                Login.Socket_AsyncTask cmd_activer_alarme = new Login.Socket_AsyncTask();
                //Appelle la méthode pour la connexion dans la classe Login
                cmd_activer_alarme.execute();
            }
        });
        mdesactiver_alarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login.getIPandPort();
                Login.CMD="3";
                Login.Socket_AsyncTask cmd_desactiver_alarme = new Login.Socket_AsyncTask();
                cmd_desactiver_alarme.execute();
            }
        });
    }
}

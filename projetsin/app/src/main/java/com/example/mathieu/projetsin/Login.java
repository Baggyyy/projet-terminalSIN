package com.example.mathieu.projetsin;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Login extends AppCompatActivity {

    private static EditText mip_adress;
    private Button mcontinuer2;
    Socket myAppSocket = null;
    public static String wifiModuleIp = "";
    public static int wifiModulePort = 0;
    public static String CMD = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mip_adress=(EditText) findViewById(R.id.ip_adress);
        mcontinuer2=(Button) findViewById(R.id.continuer2);

        mcontinuer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2=new Intent(Login.this, com.example.mathieu.projetsin.Page2.class);
                startActivity(Page2);
            }
        });




    }
    public static void getIPandPort()
    {
        String iPandPort = mip_adress.getText().toString(); //Récupère l'adresse ip et le port
        Log.d("MYTEST","IP String: "+ iPandPort); //Affiche dans la console android studio ip et le port
        String temp[]= iPandPort.split(":"); //Sépare l'adresse ip du port
        wifiModuleIp = temp[0]; //Récupère l'adresse ip avant ":"
        wifiModulePort = Integer.valueOf(temp[1]); //Récupère le port après":"
        Log.d("MY TEST","IP:" +wifiModuleIp); //affiche l'ip dans la console android studio
        Log.d("MY TEST","PORT:"+wifiModulePort); //affiche le port dans la console android studio
    }
    public static class Socket_AsyncTask extends AsyncTask<Void,Void,Void>
    {
        Socket socket;

        @Override
        protected Void doInBackground(Void... params){
            try{
                InetAddress inetAddress = InetAddress.getByName(Login.wifiModuleIp); //Obtient le nom complet de l'adresse IP
                socket = new java.net.Socket(inetAddress,Login.wifiModulePort); //Définis sur quelle port se connecte le socket
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream()); //Gère les données en sortie
                dataOutputStream.writeBytes(CMD); //envoie les données
                dataOutputStream.close(); //Stop l'envoie des données
                socket.close(); //ferme la connexion
            }catch (UnknownHostException e){e.printStackTrace();}catch (IOException e){e.printStackTrace(); }
            return null;
        }
    }
}


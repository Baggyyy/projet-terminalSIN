package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mcontinue;
    private TextView mbienvenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbienvenue=(TextView) findViewById(R.id.bienvenue);
        mcontinue=(Button) findViewById(R.id.continuer);

        mcontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Login = new Intent(MainActivity.this, com.example.mathieu.projetsin.Login.class);
                startActivity(Login);

            }
        });

    }
}


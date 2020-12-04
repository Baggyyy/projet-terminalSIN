package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    private Button mautomatique;
    private Button mmanuel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mautomatique=(Button) findViewById(R.id.automatique);
        mmanuel=(Button) findViewById(R.id.manuel);

        mmanuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page3=new Intent(Page2.this,com.example.mathieu.projetsin.Page3.class);
                startActivity(Page3);
            }
        });
    }
}


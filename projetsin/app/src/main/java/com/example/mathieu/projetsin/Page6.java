package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page6 extends AppCompatActivity {

    private Button mretour4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        mretour4=(Button) findViewById(R.id.retour4);

        mretour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page3=new Intent(Page6.this, Page3.class);
                startActivity(Page3);
            }
        });
    }
}

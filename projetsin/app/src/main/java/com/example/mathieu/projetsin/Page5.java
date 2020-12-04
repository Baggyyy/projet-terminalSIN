package com.example.mathieu.projetsin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page5 extends AppCompatActivity {

    private Button mretour3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        mretour3=(Button) findViewById(R.id.retour3);

        mretour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page3=new Intent(Page5.this, Page3.class);
                startActivity(Page3);
            }
        });

    }
}

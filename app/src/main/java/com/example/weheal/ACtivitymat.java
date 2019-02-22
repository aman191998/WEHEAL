package com.example.weheal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ACtivitymat extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymat);
        button=(Button) findViewById(R.id.tyre);
        button2=(Button) findViewById(R.id.ignition);
        button3=(Button) findViewById(R.id.suspens);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();

            }
        });
    }
    public void openActivity4()
    {
        Intent intent= new Intent(this,tyretype.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent= new Intent(this,ignitiontype.class);
        startActivity(intent);
    }
    public void openActivity6()
    {
        Intent intent= new Intent(this,suspensetype.class);
        startActivity(intent);
    }
}

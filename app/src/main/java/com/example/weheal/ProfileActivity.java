package com.example.weheal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        button=(Button) findViewById(R.id.CButton);
        button2=(Button) findViewById(R.id.materials);
        button3=(Button) findViewById(R.id.feed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity()
    {
        Intent intent= new Intent(this,Activity.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent= new Intent(this,ACtivitymat.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent= new Intent(this,Activity.class);
        startActivity(intent);
    }
}

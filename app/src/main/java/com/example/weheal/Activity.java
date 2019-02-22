package com.example.weheal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        findViewById(R.id.textView).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, ProductsActivity.class));
    }
}

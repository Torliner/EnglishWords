package com.example.torliner.englishwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class Main4Activity extends AppCompatActivity {
    Button BtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Act_Main1 (View v) {
        BtnBack = (Button)findViewById(R.id.button4);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

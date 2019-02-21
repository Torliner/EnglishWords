package com.example.torliner.englishwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button act_main2, act_main3, act_main4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Act_Main2 (View v) {
    act_main2= (Button)findViewById(R.id.button);
    Intent intent = new Intent(this,Main2Activity.class);
    startActivity(intent);
    }

    public void Act_Main3 (View v) {
        act_main3= (Button)findViewById(R.id.button2);
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    public void Act_Main4 (View v) {
        act_main4= (Button)findViewById(R.id.button3);
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}

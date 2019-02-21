package com.example.torliner.englishwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import android.graphics.Color;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button btnSel1, btnSel2, btnSel3, btnSel4, btnNext;
    TextView textView;
    String[] lines = new String[200];
    int otv = 101,otv2=0,otv3=0,otv4=0,vopr,ort=1,ort_otv=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnSel1 = (Button) findViewById(R.id.button10);
        btnSel2 = (Button) findViewById(R.id.button11);
        btnSel3 = (Button) findViewById(R.id.button12);
        btnSel4 = (Button) findViewById(R.id.button13);
        btnNext = (Button) findViewById(R.id.button14);
        textView = (TextView) findViewById(R.id.textView4);
        try {
            InputStream File_Quest = getAssets().open("Irregular_Verbs.txt");
            InputStreamReader words = new InputStreamReader(File_Quest);
            BufferedReader buffer = new BufferedReader(words);
            for (int i = 0; i < 200; i++) {
                lines[i] = buffer.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        btnClickNext(null);
    }

    public void btnClickSelect1 (View v) {
        if (ort_otv==1) {
            if (btnSel1.getText().toString().equals(lines[otv])) {
                btnSel1.setBackgroundColor(Color.GREEN);
            } else {
                if (btnSel2.getText().toString().equals(lines[otv])) {
                    btnSel1.setBackgroundColor(Color.RED);
                    btnSel2.setBackgroundColor(Color.GREEN);
                } else {
                    if (btnSel3.getText().toString().equals(lines[otv])) {
                        btnSel1.setBackgroundColor(Color.RED);
                        btnSel3.setBackgroundColor(Color.GREEN);
                    } else {
                        btnSel1.setBackgroundColor(Color.RED);
                        btnSel4.setBackgroundColor(Color.GREEN);
                    }
                }
            }
        }
        ort_otv=0;
        ort=1;
    }
    public void btnClickSelect2 (View v) {
        if (ort_otv==1) {
        if (btnSel2.getText().toString().equals(lines[otv])) {
            btnSel2.setBackgroundColor(Color.GREEN);
        }else {
            if (btnSel1.getText().toString().equals(lines[otv])) {
                btnSel2.setBackgroundColor(Color.RED);
                btnSel1.setBackgroundColor(Color.GREEN);
            }else {
                if (btnSel3.getText().toString().equals(lines[otv])) {
                    btnSel2.setBackgroundColor(Color.RED);
                    btnSel3.setBackgroundColor(Color.GREEN);
                }else {
                    btnSel2.setBackgroundColor(Color.RED);
                    btnSel4.setBackgroundColor(Color.GREEN);
                }
            }
        }
        }
        ort_otv=0;
        ort=1;
    }
    public void btnClickSelect3 (View v) {
        if (ort_otv==1) {
        if (btnSel3.getText().toString().equals(lines[otv])) {
            btnSel3.setBackgroundColor(Color.GREEN);
        }else {
            if (btnSel1.getText().toString().equals(lines[otv])) {
                btnSel3.setBackgroundColor(Color.RED);
                btnSel1.setBackgroundColor(Color.GREEN);
            }else {
                if (btnSel2.getText().toString().equals(lines[otv])) {
                    btnSel3.setBackgroundColor(Color.RED);
                    btnSel2.setBackgroundColor(Color.GREEN);
                }else {
                    btnSel3.setBackgroundColor(Color.RED);
                    btnSel4.setBackgroundColor(Color.GREEN);
                }
            }
        }
        }
        ort_otv=0;
        ort=1;
    }
    public void btnClickSelect4 (View v) {
        if (ort_otv==1) {
        if (btnSel4.getText().toString().equals(lines[otv])) {
            btnSel4.setBackgroundColor(Color.GREEN);
        }else {
            if (btnSel1.getText().toString().equals(lines[otv])) {
                btnSel4.setBackgroundColor(Color.RED);
                btnSel1.setBackgroundColor(Color.GREEN);
            }else {
                if (btnSel2.getText().toString().equals(lines[otv])) {
                    btnSel4.setBackgroundColor(Color.RED);
                    btnSel2.setBackgroundColor(Color.GREEN);
                }else {
                    btnSel4.setBackgroundColor(Color.RED);
                    btnSel3.setBackgroundColor(Color.GREEN);
                }
            }
        }
        }
        ort_otv=0;
        ort=1;
    }

    public void btnClickNext (View v) {
        if (ort == 1) {
        int var_p,min_var=101;

        btnSel1.setBackgroundColor(Color.argb(255,0,218,196));
        btnSel2.setBackgroundColor(Color.argb(255,0,218,196));
        btnSel3.setBackgroundColor(Color.argb(255,0,218,196));
        btnSel4.setBackgroundColor(Color.argb(255,0,218,196));
        Random vopr_r = new Random();
        vopr = vopr_r.nextInt(100);
        textView.setText(lines[vopr]);
        otv = vopr + 100;
        do {
            otv2 = vopr_r.nextInt(99);
            otv2+=min_var;
        } while (otv2 == otv);
        do {
            otv3 = vopr_r.nextInt(99);
            otv3+=min_var;
        } while ((otv3 == otv) | (otv3 == otv2));
        do {
            otv4 = vopr_r.nextInt(99);
            otv4+=min_var;
        } while ((otv4 == otv) | (otv4 == otv2) | (otv4 == otv3));
        var_p = vopr_r.nextInt(4);
        if (var_p == 0) {
            btnSel1.setText(lines[otv]);
            btnSel2.setText(lines[otv2]);
            btnSel3.setText(lines[otv3]);
            btnSel4.setText(lines[otv4]);
        }
        if (var_p == 1) {
            btnSel1.setText(lines[otv2]);
            btnSel2.setText(lines[otv]);
            btnSel3.setText(lines[otv3]);
            btnSel4.setText(lines[otv4]);
        }
        if (var_p == 2) {
            btnSel1.setText(lines[otv2]);
            btnSel2.setText(lines[otv3]);
            btnSel3.setText(lines[otv]);
            btnSel4.setText(lines[otv4]);
        }
        if (var_p == 3) {
            btnSel1.setText(lines[otv2]);
            btnSel2.setText(lines[otv3]);
            btnSel3.setText(lines[otv4]);
            btnSel4.setText(lines[otv]);
        }
            ort=0;
            ort_otv=1;}else {
            Toast.makeText(Main3Activity.this,"Давай, отвечай!=)",Toast.LENGTH_LONG).show();
        }
    }
}

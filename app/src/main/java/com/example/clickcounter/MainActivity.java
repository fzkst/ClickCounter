package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlus;
    private TextView counter;
    private Button btnMinus;


    public void Counter() {
        btnPlus = findViewById(R.id.buttonPlus);
        counter = findViewById(R.id.textViewCounter);
        btnMinus = findViewById(R.id.buttonMinus);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(counter.getText().toString()) + 1;
                counter.setText(String.valueOf(szam));
                if (szam == 0) {
                    counter.setTextColor(Color.parseColor("#0000ff"));
                }
                else if (szam > 0) {
                    counter.setTextColor(Color.parseColor("#228c22"));
                } else {
                    counter.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(counter.getText().toString()) - 1;
                counter.setText(String.valueOf(szam));
                if (szam == 0) {
                    counter.setTextColor(Color.parseColor("#0000ff"));
                }
                else if (szam > 0) {
                    counter.setTextColor(Color.parseColor("#228c22"));
                } else {
                    counter.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        });

        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setText("0");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Counter();
    }
}
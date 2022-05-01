package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = findViewById(R.id.b1);
        Button but2 = findViewById(R.id.b2);
        Button but3 = findViewById(R.id.b3);
        TextView t1 = findViewById(R.id.txt);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value=Integer.parseInt((String) t1.getText());
                value--;
                t1.setText(""+ Integer.toString(value));

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value= Integer.parseInt((String) t1.getText());
                value = 0;
                t1.setText(""+ Integer.toString(value));

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value=Integer.parseInt((String) t1.getText());
                value++;
                t1.setText(""+ Integer.toString(value));

            }
        });

    }
}
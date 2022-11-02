package com.example.menudriven;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText e4,e5,e6;
    Button b2;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e4 = (EditText)findViewById(R.id.e4);
        e5 = (EditText)findViewById(R.id.e5);
        e6 = (EditText)findViewById(R.id.e6);
        b2 = (Button)findViewById(R.id.b2);
        t2 = (TextView)findViewById(R.id.t2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p = Integer.parseInt(e4.getText().toString());
                int r = Integer.parseInt(e5.getText().toString());
                int n = Integer.parseInt(e6.getText().toString());
                double si = (p*r*n)/100;
                t2.setText(String.valueOf(si));
            }
        });
    }
}

package com.somildoshi.iosCalc;
// project code by Somil Doshi
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_equals,btn_add,btn_sub,btn_div,btn_mod,btn_ac,btn_decimal,btn,btn_mult;
    TextView input,output;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn_ac = findViewById(R.id.btn_ac);
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_decimal = findViewById(R.id.btn_decimal);
        btn_mod = findViewById(R.id.btn_mod);
        btn_equals = findViewById(R.id.btn_equals);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"9");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                input.setText("");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"+");
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"-");
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"×");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"÷");
            }
        });

        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"%");
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+".");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"^");
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                data = data.replaceAll("×","*");
                data = data.replaceAll("÷","/");

                Expression exp = new Expression(data);
                String result = String.valueOf(exp.calculate());
                output.setText(result);
            }
        });
    }
}
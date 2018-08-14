package com.ricardogwill.add2numbers;

// This app is based off of but also modified and extended from the tutorial at: https://www.youtube.com/watch?v=7OQJIaXNmT4

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {
        EditText e1 = (EditText) findViewById(R.id.numberOneEditText);
        EditText e2 = (EditText) findViewById(R.id.numberTwoEditText);
        TextView t1 = (TextView) findViewById(R.id.resultTextView);

        double num1 = Integer.parseInt(e1.getText().toString());
        double num2 = Integer.parseInt(e2.getText().toString());

        double sum = num1 + num2;
        t1.setText(Double.toString(sum));
    }

    public void subtract(View v) {
        EditText e1 = (EditText) findViewById(R.id.numberOneEditText);
        EditText e2 = (EditText) findViewById(R.id.numberTwoEditText);
        TextView t1 = (TextView) findViewById(R.id.resultTextView);

        double num1 = Integer.parseInt(e1.getText().toString());
        double num2 = Integer.parseInt(e2.getText().toString());

        double sum = num1 - num2;
        t1.setText(Double.toString(sum));
    }

    public void multiply(View v) {
        EditText e1 = (EditText) findViewById(R.id.numberOneEditText);
        EditText e2 = (EditText) findViewById(R.id.numberTwoEditText);
        TextView t1 = (TextView) findViewById(R.id.resultTextView);

        double num1 = Integer.parseInt(e1.getText().toString());
        double num2 = Integer.parseInt(e2.getText().toString());

        double sum = num1 * num2;
        t1.setText(Double.toString(sum));
    }

    public void divide(View v) {
        EditText e1 = (EditText) findViewById(R.id.numberOneEditText);
        EditText e2 = (EditText) findViewById(R.id.numberTwoEditText);
        TextView t1 = (TextView) findViewById(R.id.resultTextView);

        double num1 = Integer.parseInt(e1.getText().toString());
        double num2 = Integer.parseInt(e2.getText().toString());

        double sum = num1 / num2;
        t1.setText(Double.toString(sum));
    }

}

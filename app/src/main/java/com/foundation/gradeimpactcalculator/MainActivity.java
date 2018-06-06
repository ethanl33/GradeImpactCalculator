package com.foundation.gradeimpactcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String INPUT_1 = "input1";
    public static final String INPUT_2 = "input2";
    public static final String INPUT_3 = "input3";
    public static final String INPUT_4 = "input4";
    public static final String INPUT_5 = "input5";
    public static final String INPUT_6 = "input6";
    public static final String INPUT_7 = "input7";

    public static final String W_1 = "w1";
    public static final String W_2 = "w2";
    public static final String W_3 = "w3";
    public static final String W_4 = "w4";
    public static final String W_5 = "w5";
    public static final String W_6 = "w6";
    public static final String W_7 = "w7";

    public static final String P_1 = "p1";
    public static final String P_2 = "p2";
    public static final String P_3 = "p3";
    public static final String P_4 = "p4";
    public static final String P_5 = "p5";
    public static final String P_6 = "p6";
    public static final String P_7 = "p7";

    public static final String PT_1 = "pt1";
    public static final String PT_2 = "pt2";
    public static final String PT_3 = "pt3";
    public static final String PT_4 = "pt4";
    public static final String PT_5 = "pt5";
    public static final String PT_6 = "pt6";
    public static final String PT_7 = "pt7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {

        EditText in1 = (EditText) findViewById(R.id.input1);
        String in1str = in1.getText().toString();
        EditText in2 = (EditText) findViewById(R.id.input2);
        String in2str = in2.getText().toString();
        EditText in3 = (EditText) findViewById(R.id.input3);
        String in3str = in3.getText().toString();
        EditText in4 = (EditText) findViewById(R.id.input4);
        String in4str = in4.getText().toString();
        EditText in5 = (EditText) findViewById(R.id.input5);
        String in5str = in5.getText().toString();
        EditText in6 = (EditText) findViewById(R.id.input6);
        String in6str = in6.getText().toString();
        EditText in7 = (EditText) findViewById(R.id.input7);
        String in7str = in7.getText().toString();

        EditText w1 = (EditText) findViewById(R.id.w1);
        String w1str = w1.getText().toString();
        EditText w2 = (EditText) findViewById(R.id.w2);
        String w2str = w2.getText().toString();
        EditText w3 = (EditText) findViewById(R.id.w3);
        String w3str = w3.getText().toString();
        EditText w4 = (EditText) findViewById(R.id.w4);
        String w4str = w4.getText().toString();
        EditText w5 = (EditText) findViewById(R.id.w5);
        String w5str = w5.getText().toString();
        EditText w6 = (EditText) findViewById(R.id.w6);
        String w6str = w6.getText().toString();
        EditText w7 = (EditText) findViewById(R.id.w7);
        String w7str = w7.getText().toString();

        EditText p1 = (EditText) findViewById(R.id.p1);
        String p1str = p1.getText().toString();
        EditText p2 = (EditText) findViewById(R.id.p2);
        String p2str = p2.getText().toString();
        EditText p3 = (EditText) findViewById(R.id.p3);
        String p3str = p3.getText().toString();
        EditText p4 = (EditText) findViewById(R.id.p4);
        String p4str = p4.getText().toString();
        EditText p5 = (EditText) findViewById(R.id.p5);
        String p5str = p5.getText().toString();
        EditText p6 = (EditText) findViewById(R.id.p6);
        String p6str = p6.getText().toString();
        EditText p7 = (EditText) findViewById(R.id.p7);
        String p7str = p7.getText().toString();

        EditText pt1 = (EditText) findViewById(R.id.pt1);
        String pt1str = pt1.getText().toString();
        EditText pt2 = (EditText) findViewById(R.id.pt2);
        String pt2str = pt2.getText().toString();
        EditText pt3 = (EditText) findViewById(R.id.pt3);
        String pt3str = pt3.getText().toString();
        EditText pt4 = (EditText) findViewById(R.id.pt4);
        String pt4str = pt4.getText().toString();
        EditText pt5 = (EditText) findViewById(R.id.pt5);
        String pt5str = pt5.getText().toString();
        EditText pt6 = (EditText) findViewById(R.id.pt6);
        String pt6str = pt6.getText().toString();
        EditText pt7 = (EditText) findViewById(R.id.pt7);
        String pt7str = pt7.getText().toString();


        //int c1 = Integer.parseInt(category1);

        Intent data = new Intent(this, DisplayMessageActivity.class);

        data.putExtra(INPUT_1, in1str);
        data.putExtra(INPUT_2, in2str);
        data.putExtra(INPUT_3, in3str);
        data.putExtra(INPUT_4, in4str);
        data.putExtra(INPUT_5, in5str);
        data.putExtra(INPUT_6, in6str);
        data.putExtra(INPUT_7, in7str);

        data.putExtra(W_1, w1str);
        data.putExtra(W_2, w2str);
        data.putExtra(W_3, w3str);
        data.putExtra(W_4, w4str);
        data.putExtra(W_5, w5str);
        data.putExtra(W_6, w6str);
        data.putExtra(W_7, w7str);

        data.putExtra(P_1, p1str);
        data.putExtra(P_2, p2str);
        data.putExtra(P_3, p3str);
        data.putExtra(P_4, p4str);
        data.putExtra(P_5, p5str);
        data.putExtra(P_6, p6str);
        data.putExtra(P_7, p7str);

        data.putExtra(PT_1, pt1str);
        data.putExtra(PT_2, pt2str);
        data.putExtra(PT_3, pt3str);
        data.putExtra(PT_4, pt4str);
        data.putExtra(PT_5, pt5str);
        data.putExtra(PT_6, pt6str);
        data.putExtra(PT_7, pt7str);


        startActivity(data);

        /*
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.input1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        */

    }
}

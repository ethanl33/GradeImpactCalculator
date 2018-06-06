package com.foundation.gradeimpactcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DisplayMessageActivity extends AppCompatActivity {

    private String category1, category2, category3, category4, category5, category6, category7;
    private String w1, w2, w3, w4, w5, w6, w7;
    private double wt1, wt2, wt3, wt4, wt5 ,wt6, wt7;
    private double perc1, perc2, perc3, perc4, perc5, perc6, perc7;
    private double perct1, perct2, perct3, perct4, perct5, perct6, perct7;
    private double grade;
    private double weightTotal = 0;

    private double num1, num2, num3, num4, num5, num6, num7;
    private double den1, den2, den3, den4, den5, den6, den7;
    private double weightTemp = 0;
    private static DecimalFormat df2 = new DecimalFormat(".##");

    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        this.textview = (TextView) findViewById(R.id.output);
        Intent intent = getIntent();

        category1 = intent.getStringExtra(MainActivity.INPUT_1);
        category2 = intent.getStringExtra(MainActivity.INPUT_2);
        category3 = intent.getStringExtra(MainActivity.INPUT_3);
        category4 = intent.getStringExtra(MainActivity.INPUT_4);
        category5 = intent.getStringExtra(MainActivity.INPUT_5);
        category6 = intent.getStringExtra(MainActivity.INPUT_6);
        category7 = intent.getStringExtra(MainActivity.INPUT_7);

        w1 = intent.getStringExtra(MainActivity.W_1);
        w2 = intent.getStringExtra(MainActivity.W_2);
        w3 = intent.getStringExtra(MainActivity.W_3);
        w4 = intent.getStringExtra(MainActivity.W_4);
        w5 = intent.getStringExtra(MainActivity.W_5);
        w6 = intent.getStringExtra(MainActivity.W_6);
        w7 = intent.getStringExtra(MainActivity.W_7);

        if (!w1.equals(""))
        {
            wt1 = Double.parseDouble(w1);
            weightTotal += wt1;
        }
        else
            wt1 = -1;
        if (!w2.equals(""))
        {
            wt2 = Double.parseDouble(w2);
            weightTotal += wt2;
        }
        else
            wt2 = -1;
        if (!w3.equals(""))
        {
            wt3 = Double.parseDouble(w3);
            weightTotal += wt3;
        }
        else
            wt3 = -1;
        if (!w4.equals(""))
        {
            wt4 = Double.parseDouble(w4);
            weightTotal += wt4;
        }
        else
            wt4 = -1;
        if (!w5.equals(""))
        {
            wt5 = Double.parseDouble(w5);
            weightTotal += wt5;
        }
        else
            wt5 = -1;
        if (!w6.equals(""))
        {
            wt6 = Double.parseDouble(w6);
            weightTotal += wt6;
        }
        else
            wt6 = -1;
        if (!w7.equals(""))
        {
            wt7 = Double.parseDouble(w7);
            weightTotal += wt7;
        }
        else
            wt7 = -1;

        String p1 = intent.getStringExtra(MainActivity.P_1);
        String p2 = intent.getStringExtra(MainActivity.P_2);
        String p3 = intent.getStringExtra(MainActivity.P_3);
        String p4 = intent.getStringExtra(MainActivity.P_4);
        String p5 = intent.getStringExtra(MainActivity.P_5);
        String p6 = intent.getStringExtra(MainActivity.P_6);
        String p7 = intent.getStringExtra(MainActivity.P_7);
        if (!p1.equals(""))
            perc1 = Double.parseDouble(p1);
        else
            perc1 = -1;
        if (!p2.equals(""))
            perc2 = Double.parseDouble(p2);
        else
            perc2 = -1;
        if (!p3.equals(""))
            perc3 = Double.parseDouble(p3);
        else
            perc3 = -1;
        if (!p4.equals(""))
            perc4 = Double.parseDouble(p4);
        else
            perc4 = -1;
        if (!p5.equals(""))
            perc5 = Double.parseDouble(p5);
        else
            perc5 = -1;
        if (!p6.equals(""))
            perc6 = Double.parseDouble(p6);
        else
            perc6 = -1;
        if (!p7.equals(""))
            perc7 = Double.parseDouble(p7);
        else
            perc7 = -1;

        String pt1 = intent.getStringExtra(MainActivity.PT_1);
        String pt2 = intent.getStringExtra(MainActivity.PT_2);
        String pt3 = intent.getStringExtra(MainActivity.PT_3);
        String pt4 = intent.getStringExtra(MainActivity.PT_4);
        String pt5 = intent.getStringExtra(MainActivity.PT_5);
        String pt6 = intent.getStringExtra(MainActivity.PT_6);
        String pt7 = intent.getStringExtra(MainActivity.PT_7);
        if (!pt1.equals(""))
            perct1 = Double.parseDouble(pt1);
        else
            perct1 = -1;
        if (!pt2.equals(""))
            perct2 = Double.parseDouble(pt2);
        else
            perct2 = -1;
        if (!pt3.equals(""))
            perct3 = Double.parseDouble(pt3);
        else
            perct3 = -1;
        if (!pt4.equals(""))
            perct4 = Double.parseDouble(pt4);
        else
            perct4 = -1;
        if (!pt5.equals(""))
            perct5 = Double.parseDouble(pt5);
        else
            perct5 = -1;
        if (!pt6.equals(""))
            perct6 = Double.parseDouble(pt6);
        else
            perct6 = -1;
        if (!pt7.equals(""))
            perct7 = Double.parseDouble(pt7);
        else
            perct7 = -1;

        num1 = perc1;
        num2 = perc2;
        num3 = perc3;
        num4 = perc4;
        num5 = perc5;
        num6 = perc6;
        num7 = perc7;

        den1 = perct1;
        den2 = perct2;
        den3 = perct3;
        den4 = perct4;
        den5 = perct5;
        den6 = perct6;
        den7 = perct7;

        TextView warn = (TextView) findViewById(R.id.tev5);
        TextView warn2 = (TextView) findViewById(R.id.tev6);
        int numEmpty = 0;

        if (weightTotal != 100)
            warn.setText(Html.fromHtml("Warning: Weight total does not add to 100%"));
        else
            warn.setText(Html.fromHtml(""));

        if (category1.equals("") && num1 != -1 && den1 != -1 && wt1 != -1)
            numEmpty++;
        if (category2.equals("") && num2 != -1 && den2 != -1 && wt2 != -1)
            numEmpty++;
        if (category3.equals("") && num3 != -1 && den3 != -1 && wt3 != -1)
            numEmpty++;
        if (category4.equals("") && num4 != -1 && den4 != -1 && wt4 != -1)
            numEmpty++;
        if (category5.equals("") && num5 != -1 && den5 != -1 && wt5 != -1)
            numEmpty++;
        if (category6.equals("") && num6 != -1 && den6 != -1 && wt6 != -1)
            numEmpty++;
        if (category7.equals("") && num7 != -1 && den7 != -1 && wt7 != -1)
            numEmpty++;

        if (numEmpty == 1)
            warn2.setText(Html.fromHtml("Error: Enter a category name for " + numEmpty + " category before calculating"));
        else if (numEmpty != 0)
            warn2.setText(Html.fromHtml("Error: Enter a category name for " + numEmpty + " categories before calculating"));
        else
            warn2.setText(Html.fromHtml(""));

        TextView warn3 = (TextView) findViewById(R.id.tev7);
        warn3.setText(Html.fromHtml(""));

        if (num1 == 0 && den1 == 0)
            weightTotal -= wt1;
        if (num2 == 0 && den2 == 0)
            weightTotal -= wt2;
        if (num3 == 0 && den3 == 0)
            weightTotal -= wt3;
        if (num4 == 0 && den4 == 0)
            weightTotal -= wt4;
        if (num5 == 0 && den5 == 0)
            weightTotal -= wt5;
        if (num6 == 0 && den6 == 0)
            weightTotal -= wt6;
        if (num7 == 0 && den7 == 0)
            weightTotal -= wt7;


        grade = calcGrade();
        this.textview.setText(Html.fromHtml("Your original grade is " + df2.format(grade) + "%"));

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> focus = new ArrayList<>();
        if (!category1.equals(""))
            focus.add(category1 + " (" + w1 + "%)");
        if (!category2.equals(""))
            focus.add(category2 + " (" + w2 + "%)");
        if (!category3.equals(""))
            focus.add(category3 + " (" + w3 + "%)");
        if (!category4.equals(""))
            focus.add(category4 + " (" + w4 + "%)");
        if (!category5.equals(""))
            focus.add(category5 + " (" + w5 + "%)");
        if (!category6.equals(""))
            focus.add(category6 + " (" + w6 + "%)");
        if (!category7.equals(""))
            focus.add(category7 + " (" + w7 + "%)");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, focus);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView2);
        //textView.setText(category1);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void calculate(View view) {

        EditText in1 = (EditText) findViewById(R.id.inputScore1);
        String in1str = in1.getText().toString();
        EditText in2 = (EditText) findViewById(R.id.inputScore2);
        String in2str = in2.getText().toString();
        Spinner cat1 =(Spinner) findViewById(R.id.spinner);
        String cat1str = "";
        TextView warn3 = (TextView) findViewById(R.id.tev7);
        weightTemp = weightTotal;
        if (cat1 != null && cat1.getSelectedItem() != null)
        {
            cat1str = cat1.getSelectedItem().toString();
            double temp1, temp2;
            if (!in1str.equals(""))
                temp1 = Double.parseDouble(in1str);
            else
                temp1 = -1;
            if (!in2str.equals(""))
                temp2 = Double.parseDouble(in2str);
            else
                temp2 = -1;
            if (temp1 != -1 && temp2 != -1)
            {
                if (cat1str.equals(category1 + " (" + w1 + "%)"))
                {
                    if (num1 == 0 && den1 == 0)
                        weightTotal += wt1;
                    num1 += temp1;
                    den1 += temp2;
                }
                else if (cat1str.equals(category2 + " (" + w2 + "%)"))
                {
                    if (num2 == 0 && den2 == 0)
                        weightTotal += wt2;
                    num2 += temp1;
                    den2 += temp2;
                }
                else if (cat1str.equals(category3 + " (" + w3 + "%)"))
                {
                    if (num3 == 0 && den3 == 0)
                        weightTotal += wt3;
                    num3 += temp1;
                    den3 += temp2;
                }
                else if (cat1str.equals(category4 + " (" + w4 + "%)"))
                {
                    if (num4 == 0 && den4 == 0)
                        weightTotal += wt4;
                    num4 += temp1;
                    den4 += temp2;
                }
                else if (cat1str.equals(category5 + " (" + w5 + "%)"))
                {
                    if (num5 == 0 && den5 == 0)
                        weightTotal += wt5;
                    num5 += temp1;
                    den5 += temp2;
                }
                else if (cat1str.equals(category6 + " (" + w6 + "%)"))
                {
                    if (num6 == 0 && den6 == 0)
                        weightTotal += wt6;
                    num6 += temp1;
                    den6 += temp2;
                }
                else
                {
                    if (num7 == 0 && den7 == 0)
                        weightTotal += wt7;
                    num7 += temp1;
                    den7 += temp2;
                }
            }
            grade = calcGrade();

            this.textview.setText(Html.fromHtml("Your new grade is " + df2.format(grade) + "%"));
            warn3.setText(Html.fromHtml(""));
        }
        else
            warn3.setText(Html.fromHtml("Fix error before continuing"));
    }

    public void reset(View view){
        num1 = perc1;
        den1 = perct1;

        num2 = perc2;
        den2 = perct2;

        num3 = perc3;
        den3 = perct3;

        num4 = perc4;
        den4 = perct4;

        num5 = perc5;
        den5 = perct5;

        num6 = perc6;
        den6 = perct6;

        num7 = perc7;
        den7 = perct7;

        weightTotal = weightTemp;

        grade = calcGrade();
        this.textview.setText(Html.fromHtml("Your original grade is " + df2.format(grade) + "%"));
    }

    public double calcGrade(){
        double grade1, grade2, grade3, grade4, grade5, grade6, grade7, ans;
        ans = 0;
        if (num1 != -1 && den1 != -1 && wt1 != -1) {
            if (num1 == 0 && den1 == 0)
                grade1 = 0;
            else
                grade1 = (wt1 / weightTotal) * (num1 / den1);
            ans += grade1;
        }
        if (num2 != -1 && den2 != -1 && wt2 != -1) {
            if (num2 == 0 && den2 == 0)
                grade2 = 0;
            else
                grade2 = (wt2 / weightTotal) * (num2 / den2);
            ans += grade2;
        }
        if (num3 != -1 && den3 != -1 && wt3 != -1) {
            if (num3 == 0 && den3 == 0)
                grade3 = 0;
            else
                grade3 = (wt3 / weightTotal) * (num3 / den3);
            ans += grade3;
        }
        if (num4 != -1 && den4 != -1 && wt4 != -1) {
            if (num4 == 0 && den4 == 0)
                grade4 = 0;
            else
                grade4 = (wt4 / weightTotal) * (num4 / den4);
            ans += grade4;
        }
        if (num5 != -1 && den5 != -1 && wt5 != -1){
            if (num5 == 0 && den5 == 0)
                grade5 = 0;
            else
                grade5 = (wt5 / weightTotal) * (num5 / den5);
            ans += grade5;
        }
        if (num6 != -1 && den6 != -1 && wt6 != -1){
            if (num6 == 0 && den6 == 0)
                grade6 = 0;
            else
                grade6 = (wt6 / weightTotal) * (num6 / den6);
            ans += grade6;
        }
        if (num7 != -1 && den7 != -1 && wt7 != -1){
            if (num7 == 0 && den7 == 0)
                grade7 = 0;
            else
                grade7 = (wt7 / weightTotal) * (num7 / den7);
            ans += grade7;
        }
        ans *= 100;
        return ans;
    }
}

package com.example.androidexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    Calculator CALC=new Calculator();
    EditText number1;
    EditText number2;
    String memoryNumber="0";
    String result;
    boolean ISeven=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public String obtain_n1(){
        number1   = (EditText)findViewById(R.id.number_1);
        String number1_string=number1.getText().toString();
        return number1_string;

    }

    public String obtain_n2(){
        number2   = (EditText)findViewById(R.id.number_2);
        String number2_string=number2.getText().toString();
        return number2_string;
    }

    public void add(View v){
        result=CALC.add(obtain_n1(),obtain_n2());
        ISeven=CALC.IsEven(result);
        printResult(result);
        printEven();
    }

    public void sub(View v){
        result=CALC.sub(obtain_n1(),obtain_n2());
        ISeven=CALC.IsEven(result);
        printResult(result);
        printEven();
    }

    public void div(View v){
        result=CALC.div(obtain_n1(),obtain_n2());
        ISeven=CALC.IsEven(result);
        printResult(result);
        printEven();
    }

    public void mul(View v){
        result=CALC.mul(obtain_n1(),obtain_n2());
        ISeven=CALC.IsEven(result);
        printResult(result);
        printEven();
    }

    public void MC(View v){
        memoryNumber="0";
        printResult(memoryNumber);
    }
    public void MR(View v){
        result=memoryNumber;
        printResult(result);
    }
    public void M_add(View v){
        memoryNumber=CALC.add(obtain_n1(),memoryNumber);
    }
    public void M_sub(View v){
        memoryNumber=CALC.sub(memoryNumber,obtain_n1());
    }


    public void printResult(String result){
        TextView textreset=findViewById(R.id.textView);
        textreset.setText(result);
        printEven();

    }

    public void printEven(){
        RadioButton even  = (RadioButton)findViewById(R.id.even);
        RadioButton odd  = (RadioButton)findViewById(R.id.odd);
        if(ISeven==true){
            even.setChecked(true);
        }else{
            odd.setChecked(true);
        }
    }




}

package com.example.androidexam1;
import android.util.Log;
public class Calculator {


    public String  add(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d+n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


      return result ;
    }

    public String sub(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d-n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public String  mul(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d*n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public String  div(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            if (n2d == 0) {
                throw new IllegalArgumentException("Argument 'divisor' is 0");
            }

            n3=n1d/n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public boolean IsEven(String n1){
        boolean even=false;
        try{
        double n=Double.valueOf(n1);
        if(n % 2 == 0) {
            even=true;
        }else{
            even=false;
        }
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
        }

       return even;
    }


}

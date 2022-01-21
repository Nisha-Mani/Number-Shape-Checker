package com.nisha.triangularandsquarenumberchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{
        public boolean isTriangularNum(int num){
            int calc_num = 8*num+1;
            int sqrt = (int) Math.sqrt(calc_num);
            if(sqrt*sqrt == calc_num)
                return true;
            else
                return false;
        }
        public boolean isSquareNym(int num){
            int sqrt = (int) Math.sqrt(num);
            if(sqrt*sqrt == num)
                return true;
            else
                return false;
        }
    }
    public void calcButton(View view){
        EditText editTextinputNum = (EditText) findViewById(R.id.editTextNumberInput);
        int inputNumber = Integer.parseInt(editTextinputNum.getText().toString());
        Number numb= new Number();
        String toastMsg;
        if(editTextinputNum.getText().toString().isEmpty())
            toastMsg="Please enter a number";
        else {
            if (numb.isSquareNym(inputNumber) && numb.isTriangularNum(inputNumber)) {
                toastMsg = "Both a triangular and square number";
            } else if (numb.isTriangularNum(inputNumber)) {
                toastMsg = "Number is a triangle but not a square";
            } else if (numb.isSquareNym(inputNumber)) {
                toastMsg = "Number is a square but not a triangle";
            } else {
                toastMsg = "Number is neither a triangle nor a square";
            }
        }
        Toast.makeText(this,toastMsg,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
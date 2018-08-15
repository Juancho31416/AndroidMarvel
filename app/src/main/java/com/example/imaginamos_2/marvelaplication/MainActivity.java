package com.example.imaginamos_2.marvelaplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Constant;
import org.mariuszgromada.math.mxparser.Expression;

import static com.example.imaginamos_2.marvelaplication.R.id.TextInput;
import static com.example.imaginamos_2.marvelaplication.R.id.button2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mButton = findViewById(button2);



        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final String result = onClickCalc(v);
            }
        });

        
    }

    /* Este metodo se encarga de calcular la operación ingresada*/
    public double calcular(String formula){
        Constant pi = new Constant("3.1416");
        Expression e = new Expression(formula);
        double calculate = e.calculate();

        return calculate;
    }

    /* Este metodo se encarga de obtener la formula ingresada validarla  y llamar el metodo de calculo */
    public String onClickCalc(View view){

        String inputFormula ="";

        EditText mEdit = findViewById(TextInput);

        inputFormula = mEdit.getText().toString();

        String result ="";

        if( inputFormula!= null || inputFormula != "" ){

            double s = calcular(inputFormula);

            result = String.valueOf(s);

        }
        else {

            Toast.makeText(this, "Por favor ingrese una formula!",
                    Toast.LENGTH_LONG).show();
        }

        return  result;
    }


    public static boolean esMultiplo(int n1,int n2){
        if (n1%n2==0)
            return true;
        else
            return false;
    }
}


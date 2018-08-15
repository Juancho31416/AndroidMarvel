package com.example.imaginamos_2.marvelaplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

import static com.example.imaginamos_2.marvelaplication.R.id.TextInput;
import static com.example.imaginamos_2.marvelaplication.R.id.button2;
import static com.example.imaginamos_2.marvelaplication.R.id.textViewResult;

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


    /* Este metodo se encarga de obtener la formula ingresada validarla  y llamar el metodo de calculo */
    public String onClickCalc(View view){

        //region variables
        String inputFormula;
        String result = "";
        int multiplos[] = {3,5,7,11,13};
        int multiploDe = 0;
        int resultadoCalculo=0;
        //endregion

        //region inputs
        EditText mEdit = findViewById(TextInput);
        TextView mView = findViewById(textViewResult);
        //endregion


        inputFormula = mEdit.getText().toString();


        if( inputFormula!= null || inputFormula != "" ){

            //region calcula y setea el view con el resultado
            resultadoCalculo = calcular(inputFormula);

            result = String.valueOf(resultadoCalculo);

            mView.setText(result);

            //endregion


            if(0 != resultadoCalculo) {
                //region valida la longitud de multiplos y revisa si el resultado es multiplo
                int lenghtArray = multiplos.length;

                int i;
                for (i = 0; i <= lenghtArray; i++) {

                    boolean probarMultiplo = esMultiplo(resultadoCalculo, multiplos[i]);
                    if (probarMultiplo == true) {
                        multiploDe = multiplos[i];
                        break;
                    }
                }
                //endregion
            }
            else {

                result = String.valueOf(multiploDe);
            }

            }
        else {

            Toast.makeText(this, "Por favor ingrese una formula!",
                    Toast.LENGTH_LONG).show();


            }

            if( resultadoCalculo == 0 && multiploDe ==0){

                result = "0";
            }



        return  result;
    }

    /*Este metodo revisa si el numero es multiplo retornando un booleano */
    public static boolean esMultiplo(int n1,int n2){
        if (n1%n2==0)
            return true;
        else
            return false;
    }


    /* Este metodo se encarga de calcular la operación ingresada y devuelvee el numero redondeado*/
    public int calcular(String formula){

        Expression e = new Expression(formula);
        double result = e.calculate();
        int numeroRedondeado = (int)result;

        return numeroRedondeado;
    }


}


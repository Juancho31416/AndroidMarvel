package com.example.imaginamos_2.marvelaplication.utils;

import org.mariuszgromada.math.mxparser.Expression;

import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";

    public static String parseDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN);
        return format.format(date);
    }

    /*Este metodo revisa si el numero es multiplo retornando un booleano */
    public static boolean esMultiplo(int n1,int n2){
        if (n1%n2==0)
            return true;
        else
            return false;
    }


    /* Este metodo se encarga de calcular la operación ingresada y devuelve el numero redondeado*/
    public static int calcular(String formula){

        Expression e = new Expression(formula);
        double result = e.calculate();
        int numeroRedondeado = (int)result;

        return numeroRedondeado;
    }


}

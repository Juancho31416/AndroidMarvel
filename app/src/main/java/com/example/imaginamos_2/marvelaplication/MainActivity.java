package com.example.imaginamos_2.marvelaplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.imaginamos_2.marvelaplication.models.MarvelList;
import com.example.imaginamos_2.marvelaplication.models.Response;
import com.example.imaginamos_2.marvelaplication.models.*;
import com.example.imaginamos_2.marvelaplication.service.apiInterface;
import com.example.imaginamos_2.marvelaplication.utils.HashGenerator;
import com.example.imaginamos_2.marvelaplication.utils.ViewAdapter;
import com.example.imaginamos_2.marvelaplication.utils.apiUtils;


import retrofit2.Call;
import retrofit2.Callback;

import static com.example.imaginamos_2.marvelaplication.R.id.TextInput;
import static com.example.imaginamos_2.marvelaplication.R.id.button2;
import static com.example.imaginamos_2.marvelaplication.R.id.textViewResult;

import static com.example.imaginamos_2.marvelaplication.utils.utils.*;


public class MainActivity extends AppCompatActivity {

    MarvelList Data;
    private ProgressDialog progress;
    private MainActivity context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(button2);

        this.progress = new ProgressDialog(context);
        this.progress.setCancelable(false);
        this.progress.setMessage(getString(R.string.loading));


        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //region calcula hash
                HashGenerator generator = new HashGenerator();
                String publicKey = getString(R.string.keyPublic);
                String privateKey = getString(R.string.privateKey);
                String ts = getString(R.string.ts);
                String hash = generator.generateHash(ts, publicKey, privateKey);
                //endregion

                //region inicializa interface para servicio
                String result = onClickCalc(v);

                apiInterface ApiInterface;

                ApiInterface = apiUtils.getService();
                //endregion

                //region llama el servicio segun el resultado del calculo del primo

                switch (result) {
                    case "0":

                        Call<Response> callCharacters = ApiInterface.getCharacters(publicKey, hash, ts);

                        callCharacters.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                                Data = (MarvelList<characters>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });
                        break;
                    case "3":

                        Call<Response> callComics = ApiInterface.getComics(publicKey, hash, ts);
                        callComics.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<comics>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });
                        break;
                    case "5":

                        Call<Response> callComics5 = ApiInterface.getComics(publicKey, hash, ts);
                        callComics5.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<comics>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });

                        break;
                    case "7":

                        Call<Response> callCreators =ApiInterface.getCreators(publicKey, hash, ts);
                        callCreators.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<creators>) response.body().getData();

                                ViewAdapter adapter =  new ViewAdapter();



                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {
                            }
                        });

                        break;
                    case "11":

                        Call<Response> callEvents = ApiInterface.getEvents(publicKey, hash, ts);
                        callEvents.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<events>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });
                        break;
                    case "13":

                        Call<Response> callSeries = ApiInterface.getSeries(publicKey, hash, ts);
                        callSeries.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<series>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });
                        break;
                    default:

                        Call<Response> callStories = ApiInterface.getStories(publicKey, hash, ts);
                        callStories.enqueue(new Callback<Response>() {

                            @Override
                            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                                Data = (MarvelList<storyList>) response.body().getData();

                            }

                            @Override
                            public void onFailure(Call<Response> call, Throwable t) {

                            }
                        });
                        break;
                }

                //endregion

                //region llamar la vista para cualquier tipo de data


                //endregion
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

            //region adecua el string
            inputFormula = inputFormula.replace(" ","");
            //endregion


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

                 Toast.makeText(this, "Por favor ingrese una formula!", Toast.LENGTH_LONG).show();

            }

            if( resultadoCalculo == 0 ) {

                result = "0";


            }
            else if(resultadoCalculo != 0 && multiploDe ==0){

                result = "undefined";
            }


        return  result;
    }




}


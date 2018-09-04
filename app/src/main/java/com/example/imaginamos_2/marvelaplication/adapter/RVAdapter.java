package com.example.imaginamos_2.marvelaplication.adapter;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.imaginamos_2.marvelaplication.R;
import com.example.imaginamos_2.marvelaplication.models.*;


public class RVAdapter extends  RecyclerView.Adapter<RVAdapter.ResponseViewHolder>{

  public  MarvelList marvelList;
  public  comics comicArray[];
  public  events eventsArray[];
  public  characters characterArray[];
  public  stories storiesArray[];
  public  creators creatorsArray[];
  public  series seriesArray[];

    public String type;


    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        ResponseViewHolder rh = new ResponseViewHolder(v);

        return rh;
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder responseViewHolder, int i) {

        switch(type){
            case "comic":

                responseViewHolder.resText.setText(comicArray[i].getDescription().toString());
                responseViewHolder.resImage.setImageURI(Uri.parse(comicArray[i].getThumbnail().getPath().toString() +"."+comicArray[i].getThumbnail().getExtension().toString() ));

                break;
            case "character":

                responseViewHolder.resText.setText(characterArray[i].getDescription());
                responseViewHolder.resImage.setImageURI(Uri.parse(characterArray[i].getThumbnail().getPath().toString() +"."+characterArray[i].getThumbnail().getExtension().toString()));

                break;
            case "stories":
                responseViewHolder.resText.setText(storiesArray[i].getDescription());
                responseViewHolder.resImage.setImageURI(Uri.parse(storiesArray[i].getThumbnail().getPath().toString() +"."+storiesArray[i].getThumbnail().getExtension().toString()));

                break;
            case "events":
                responseViewHolder.resText.setText(eventsArray[i].getDescription());
                //responseViewHolder.resImage.setImageURI(Uri.parse(eventsArray[i].getPath().toString() +"."+storiesArray[i].getThumbnail().getExtension().toString()));


                break;
            case "creators":
                responseViewHolder.resText.setText(creatorsArray[i].getFullName());
                //responseViewHolder.resImage.setImageURI(Uri.parse(creatorsArray[i]..getPath().toString() +"."+storiesArray[i].getThumbnail().getExtension().toString()));

                break;
            case "series":
                responseViewHolder.resText.setText(seriesArray[i].getDescription());
              //  responseViewHolder.resImage.setImageURI(Uri.parse(seriesArray[i].getThumbnail().getPath().toString() +"."+storiesArray[i].getThumbnail().getExtension().toString()));

                break;

        }





       // responseViewHolder.resText.setText();
       // responseViewHolder.resImage.setImageURI();

    }

    @Override
    public int getItemCount() {
        return marvelList.getCount();
    }

    public static class ResponseViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView resImage;
        EditText resText;


        ResponseViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            resImage = (ImageView)itemView.findViewById(R.id.imageView);
            resText = (EditText)itemView.findViewById(R.id.editText);
        }
    }


}

package com.example.imaginamos_2.marvelaplication.utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewAdapter  extends RecyclerView.Adapter<ViewAdapter.ViewHolder>{

    private String[] mDataSet;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // en este ejemplo cada elemento consta solo de un título
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {

        if(mDataSet.length >0){
            return mDataSet.length;
        }
        else{
            return 0;
        }

    }



}

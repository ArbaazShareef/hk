package com.example.arbaaz.hashknowledge;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arbaaz on 5/10/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private static final String TAG = "StockAdapter";
   // private List<Official> OfficialsList;
    private MainActivity mainAct;

    public MainAdapter(List officialsList, MainActivity mainAct) {

        this.mainAct = mainAct;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: MAKING NEW");
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.temp_list_row, parent, false);
        itemView.setOnClickListener(mainAct);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      //  Official official = OfficialsList.get(position);
       // holder.ViewHolderTitle.setText(official.getTitle());
        //holder.ViewHolderName.setText(official.getName()+" ("+official.getParty()+")");
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}

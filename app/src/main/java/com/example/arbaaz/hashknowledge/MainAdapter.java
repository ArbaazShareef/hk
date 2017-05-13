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
    private static final String TAG = "MainAdapter";
    private List<Post> PList;
    private MainActivity mainAct;
private mainFragment mainFrag;
    public MainAdapter(List<Post> officialsList, MainActivity mainAct) {
        PList = officialsList;
        this.mainAct = mainAct;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: MAKING NEW");
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.temp_list_row, parent, false);
        itemView.setOnClickListener(mainFrag);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Post p = PList.get(position);
        //holder.ViewHolderTitle.setText(p.getTitle());
        //holder.ViewHolderName.setText(official.getName()+" ("+official.getParty()+")");
    }

    @Override
    public int getItemCount() {
        return PList.size();
    }
}

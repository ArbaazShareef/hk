package com.example.arbaaz.hashknowledge;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Arbaaz on 5/10/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView ViewHolderTitle,ViewHolderName;
    public MyViewHolder(View itemView) {
        super(itemView);
        ViewHolderTitle = (TextView)itemView.findViewById(R.id.ViewHolderTitle);
        ViewHolderName = (TextView)itemView.findViewById(R.id.ViewHolderName);
    }
}

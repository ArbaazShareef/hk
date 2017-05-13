package com.example.arbaaz.hashknowledge;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arbaaz on 5/10/2017.
 */

@SuppressLint("ValidFragment")
public class mainFragment extends Fragment implements View.OnClickListener {
     // Layout's recyclerview
     private List PList = new ArrayList<>();
    Post post ;
    MainAdapter mainAdapter;
    MainActivity mainActivity;
    String TAG = "MAIN_FRAGMENT";

    private RecyclerView recyclerView;

    @SuppressLint("ValidFragment")
    public mainFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.d(TAG,"Main Fragment Created ");
        View root = inflater.inflate(R.layout.tempfrag, container, false);
        post = new Post();
        PList.add(post);
        mainAdapter = new MainAdapter(PList,mainActivity);





        recyclerView = (RecyclerView)root.findViewById(R.id.MainRview);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.notifyDataSetChanged();
        return root;


    }

    @Override
    public void onClick(View v) {

    }
}

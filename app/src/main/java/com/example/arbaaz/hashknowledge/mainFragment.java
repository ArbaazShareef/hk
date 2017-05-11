package com.example.arbaaz.hashknowledge;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arbaaz on 5/10/2017.
 */

public class mainFragment extends Fragment {
    private RecyclerView recyclerView; // Layout's recyclerview

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tempfrag, container, false);


    }
}

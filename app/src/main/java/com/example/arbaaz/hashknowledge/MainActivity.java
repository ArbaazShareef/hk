package com.example.arbaaz.hashknowledge;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView; // Layout's recyclerview
    private List ItemList = new ArrayList<>();
    private MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        final mainFragment mainfrag = new mainFragment();
        final mainFragmentb mainfragb = new mainFragmentb();
        final FragmentManager fragmentManager = getFragmentManager();
        final View fragholder = findViewById(R.id.mainFragment);
        ItemList.add("Hello");
        recyclerView = (RecyclerView)fragholder.findViewById(R.id.MainRview);
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(ItemList,this);
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.notifyDataSetChanged();

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.mainFragment)).commit();
                    transaction.replace(R.id.mainFragment, mainfrag);
                    transaction.addToBackStack(null);

                    // Commit the transaction
                    transaction.commit();
                }else if (tabId == R.id.tab_friends) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.mainFragment, mainfragb);
                    transaction.addToBackStack(null);

                    // Commit the transaction
                    transaction.commit();
                }
            }
        });



    }

    @Override
    public void onClick(View v) {

    }
}

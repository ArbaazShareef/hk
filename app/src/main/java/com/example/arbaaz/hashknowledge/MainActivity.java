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
     // Layout's recyclerview

    private MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        final mainFragment mainfrag = new mainFragment(this);
       // mainfrag.TAG = "main";
        final mainFragmentb mainfragb = new mainFragmentb();
       // mainfragb.TAG = "b";
        final FragmentManager fragmentManager = getFragmentManager();
        final View fragholder = findViewById(R.id.mainFragment);
        fragmentManager.beginTransaction().add(R.id.mainFragment,mainfrag).commit();
        fragmentManager.beginTransaction().add(R.id.mainFragment,mainfragb).commit();


        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {

                    fragmentManager.beginTransaction().show(mainfrag).commit();
                    fragmentManager.beginTransaction().hide(mainfragb).commit();
                }else if (tabId == R.id.tab_friends) {

                    fragmentManager.beginTransaction().show(mainfragb).commit();

                    fragmentManager.beginTransaction().hide(mainfrag).commit();

                }
            }
        });



    }

    @Override
    public void onClick(View v) {

    }
}

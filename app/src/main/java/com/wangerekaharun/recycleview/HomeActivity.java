package com.wangerekaharun.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.wangerekaharun.recycleview.Activities.SingleCounty;
import com.wangerekaharun.recycleview.Adapters.CountiesAdapter;
import com.wangerekaharun.recycleview.Models.Counties;
import com.wangerekaharun.recycleview.Utils.CountiesData;
import com.wangerekaharun.recycleview.Utils.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountiesAdapter countiesAdapter;
    private List<Counties>countiesList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView=(RecyclerView)findViewById(R.id.countylist_rv);

        countiesAdapter = new CountiesAdapter(countiesList);


        //fetching the array list with the counties name
        CountiesAdapter countiesAdapter = new CountiesAdapter(CountiesData.getCounties());


        //setting the layout manager and adapter for recycleiew
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(countiesAdapter);

        //setting clicklistener for each item in recycleview
        recyclerView.addOnItemTouchListener(new ItemClickListener(getApplicationContext(), recyclerView, new ItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent in = new Intent(HomeActivity.this, SingleCounty.class);
                startActivity(in);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));







        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Recycleview demo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

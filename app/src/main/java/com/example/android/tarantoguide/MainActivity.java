package com.example.android.tarantoguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.TabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }
}

package com.example.kevinpatel.kidzania;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shapes extends AppCompatActivity {


    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFrags(new circle(), "");
        viewPagerAdapter.addFrags(new cone(), "");
        viewPagerAdapter.addFrags(new cube(), "");
        viewPagerAdapter.addFrags(new cylinder(), "");
        viewPagerAdapter.addFrags(new oval(), "");
        viewPagerAdapter.addFrags(new rectangle(), "");
        viewPagerAdapter.addFrags(new square(), "");
        viewPagerAdapter.addFrags(new triangle(), "");

        viewPager.setAdapter(viewPagerAdapter);


    }

}


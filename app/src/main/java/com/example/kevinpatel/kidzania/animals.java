package com.example.kevinpatel.kidzania;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class animals extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFrags(new bear(), "");
        viewPagerAdapter.addFrags(new camel(), "");
        viewPagerAdapter.addFrags(new cat(), "");
        viewPagerAdapter.addFrags(new cheetah(), "");
        viewPagerAdapter.addFrags(new cow(), "");
        viewPagerAdapter.addFrags(new deer(), "");
        viewPagerAdapter.addFrags(new dog(), "");
        viewPagerAdapter.addFrags(new donkey(), "");
        viewPagerAdapter.addFrags(new duck(), "");
        viewPagerAdapter.addFrags(new elephant(), "");





        viewPager.setAdapter(viewPagerAdapter);


    }
}

package com.example.kevinpatel.kidzania;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class colors extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFrags(new red(), "");
        viewPagerAdapter.addFrags(new yellow(), "");
        viewPagerAdapter.addFrags(new blue(), "");
        viewPagerAdapter.addFrags(new pink(), "");
        viewPagerAdapter.addFrags(new green(), "");
        viewPagerAdapter.addFrags(new purple(), "");
        viewPagerAdapter.addFrags(new orange(), "");






        viewPager.setAdapter(viewPagerAdapter);


    }

}

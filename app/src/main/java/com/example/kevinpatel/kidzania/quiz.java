package com.example.kevinpatel.kidzania;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class quiz extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFrags(new qcat(), "");
        viewPagerAdapter.addFrags(new qred(), "");
        viewPagerAdapter.addFrags(new qapple(), "");
        viewPagerAdapter.addFrags(new qthree(), "");
        viewPagerAdapter.addFrags(new qsquare(), "");
        viewPagerAdapter.addFrags(new qgreen(), "");
        viewPagerAdapter.addFrags(new qdog(), "");
        viewPagerAdapter.addFrags(new qicecream(), "");
        viewPagerAdapter.addFrags(new qseven(), "");
        viewPagerAdapter.addFrags(new qcone(), "");





        viewPager.setAdapter(viewPagerAdapter);


    }
}

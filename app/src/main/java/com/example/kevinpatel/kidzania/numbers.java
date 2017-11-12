package com.example.kevinpatel.kidzania;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class numbers extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFrags(new one(), "");
        viewPagerAdapter.addFrags(new two(), "");
        viewPagerAdapter.addFrags(new three(), "");
        viewPagerAdapter.addFrags(new four(), "");
        viewPagerAdapter.addFrags(new five(), "");
        viewPagerAdapter.addFrags(new six(), "");
        viewPagerAdapter.addFrags(new seven(), "");
        viewPagerAdapter.addFrags(new eight(), "");
        viewPagerAdapter.addFrags(new nine(), "");
        viewPagerAdapter.addFrags(new ten(), "");





        viewPager.setAdapter(viewPagerAdapter);


    }

}

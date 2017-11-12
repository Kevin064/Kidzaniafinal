package com.example.kevinpatel.kidzania;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class alphabets extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        viewPager = (ViewPager) findViewById(R.id.viewPagerrr);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFrags(new a(), "");
        viewPagerAdapter.addFrags(new b(), "");
        viewPagerAdapter.addFrags(new c(), "");
        viewPagerAdapter.addFrags(new d(), "");
        viewPagerAdapter.addFrags(new e(), "");
        viewPagerAdapter.addFrags(new f(), "");
        viewPagerAdapter.addFrags(new g(), "");
        viewPagerAdapter.addFrags(new h(), "");
        viewPagerAdapter.addFrags(new i(), "");
        viewPagerAdapter.addFrags(new j(), "");
        viewPagerAdapter.addFrags(new k(), "");
        viewPagerAdapter.addFrags(new l(), "");
        viewPagerAdapter.addFrags(new m(), "");
        viewPagerAdapter.addFrags(new n(), "");
        viewPagerAdapter.addFrags(new o(), "");
        viewPagerAdapter.addFrags(new p(), "");
        viewPagerAdapter.addFrags(new q(), "");
        viewPagerAdapter.addFrags(new ra(), "");
        viewPagerAdapter.addFrags(new s(), "");
        viewPagerAdapter.addFrags(new t(), "");
        viewPagerAdapter.addFrags(new u(), "");
        viewPagerAdapter.addFrags(new v(), "");
        viewPagerAdapter.addFrags(new w(), "");
        viewPagerAdapter.addFrags(new x(), "");
        viewPagerAdapter.addFrags(new y(), "");
        viewPagerAdapter.addFrags(new z(), "");





        viewPager.setAdapter(viewPagerAdapter);


    }


}

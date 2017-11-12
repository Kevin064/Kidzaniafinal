package com.example.kevinpatel.kidzania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.kevinpatel.kidzania.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void iv(View view){
        Intent intent = new Intent(this,alphabets.class);
        startActivity(intent);
    }
    public void iv1(View view){
        Intent intent = new Intent(this,numbers.class);
        startActivity(intent);
    }
    public void iv4(View view){
        Intent intent = new Intent(this,shapes.class);
        startActivity(intent);
    }
    public void colors(View view){
        Intent intent = new Intent(this,colors.class);
        startActivity(intent);
    }
    public void animals(View view){
        Intent intent = new Intent(this,animals.class);
        startActivity(intent);
    }
    public void quiz(View view){
        Intent intent = new Intent(this,listening.class);
        startActivity(intent);
    }
}

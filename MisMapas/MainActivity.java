package com.publicicat.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaOne(View v){
        Intent one = new Intent(this, MapsActivity.class);
        one.putExtra("key", "Michigan");
        startActivity(one);
    }
    public void irMapaTwo(View v){
        Intent two = new Intent(this, MapsActivity.class);
        two.putExtra("key", "Castle");
        startActivity(two);
    }
    public void irMapaThree(View v){
        Intent three = new Intent(this, MapsActivity.class);
        three.putExtra("key", "Boat");
        startActivity(three);
    }
    public void irMapaFour(View v){
        Intent four = new Intent(this, MapsActivity.class);
        four.putExtra("key", "Iceland");
        startActivity(four);
    }
}
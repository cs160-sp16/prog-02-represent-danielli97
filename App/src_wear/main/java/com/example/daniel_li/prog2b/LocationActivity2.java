package com.example.daniel_li.prog2b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class LocationActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //String location = getIntent().getExtras().getString("2");
        setContentView(R.layout.locationactivity2);

    }
    public void hearShake() {
        Intent intent = new Intent(this, LocationActivity.class );
        startActivity(intent);
    }

}

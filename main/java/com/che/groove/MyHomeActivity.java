package com.che.groove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MyHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home);

        Intent intent = getIntent();

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_my_home);
    }

    public void moveMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveMessage(View view){
        Intent intent = new Intent(this, MessageHomeActivity.class);
        startActivity(intent);
    }

    public void moveProf(View view){
        Intent intent = new Intent(this, ProfActivity.class);
        startActivity(intent);
    }

    public void moveDiscSet(View view){
        Intent intent = new Intent(this, DiscSetActivity.class);
        startActivity(intent);
    }

    public void moveAppSet(View view){
        Intent intent = new Intent(this, AppSetActivity.class);
        startActivity(intent);
    }

    public void moveHelp(View view){
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }


}

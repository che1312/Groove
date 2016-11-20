package com.che.groove;

import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MessagesHomeActivity extends AppCompatActivity {
    private static final String TAG = "Testing: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages_home);

        Intent intent = getIntent();

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_messages_home);
        Log.d(TAG, "Shit's lit yo");
    }

    public void moveMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveHome(View view){
        Intent intent = new Intent(this, MyHomeActivity.class);
        startActivity(intent);
    }

}

package com.che.groove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MessagesHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages_home);

        Intent intent = getIntent();

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_messages_home);
    }
}

package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EventOrganiser extends AppCompatActivity {
    TextView eventOrganiserNameUser; // Username Textview variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_organiser);

        Intent intent = getIntent(); // Gets the intent send from ActibityMain
        String Username = intent.getStringExtra(MainActivity.TEXT);
        int Password = intent.getIntExtra(MainActivity.NUMBER,0);

        eventOrganiserNameUser = findViewById(R.id.Name_User);
        String message = "Welcome"+ Username+ "! You are logged in as an Event Organiser.";//The message that the Textview shows
        eventOrganiserNameUser.setText(message); // Set the message of textview
    }
}
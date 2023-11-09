package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Participant extends AppCompatActivity {
    TextView participantNameUser; // Username Textview variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant);

        Intent intent = getIntent(); // Gets the intent send from ActibityMain
        String Username = intent.getStringExtra(MainActivity.TEXT);
        int Password = intent.getIntExtra(MainActivity.NUMBER,0);

        participantNameUser = findViewById(R.id.Name_User);
        String message = "Welcome"+ Username+ "! You are logged in as an Participant."; //The message that the Textview shows
        participantNameUser.setText(message); // Set the message of textview

    }
}
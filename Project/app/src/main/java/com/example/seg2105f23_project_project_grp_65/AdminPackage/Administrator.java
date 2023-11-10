package com.example.seg2105f23_project_project_grp_65.AdminPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.seg2105f23_project_project_grp_65.MainActivity;
import com.example.seg2105f23_project_project_grp_65.R;

public class Administrator extends AppCompatActivity {
    TextView adminNameUser; // Username Textview variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        Intent intent = getIntent(); // Gets the intent send from ActibityMain
        String Username = intent.getStringExtra(MainActivity.TEXT);
        int Password = intent.getIntExtra(MainActivity.NUMBER,0);

        adminNameUser = findViewById(R.id.Name_User);

        String message = "Welcome"+ Username+ "! You are logged in as an Aministrator."; //The message that the Textview shows
        adminNameUser.setText(message); // Set the message of textview
    }


}
package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button register; // Variable for the button.
    public static final String TEXT = "com.example.seg2105f23_project_project_grp_65.EXTRA_TEXT"; // Variable for the text
    public static final String NUMBER = "com.example.seg2105f23_project_project_grp_65.EXTRA_NUMBER"; //
    EditText UserNameInput; // Variable for the User Name input
    EditText PasswordInput; // Variable for the Password input

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserNameInput = findViewById(R.id.UsernameText); // Get the ID from the TextInput
        PasswordInput = findViewById(R.id.PasswordText); // Get the ID from the IntInput
    }
    // This is the right Project

    // This method is to open MainActivity2
    //  Is the OnCreate method for the register button
    public void openActivity2(View view){
        String UserName = UserNameInput.getText().toString();
        int Password = Integer.parseInt(PasswordInput.getText().toString());

        register = findViewById(R.id.Register);

        Intent intent = new Intent(this, Administrator.class); // Open the Administrator activity
        intent.putExtra(TEXT, UserName); // Pass the username variable to the administrator class
        intent.putExtra(NUMBER, Password); // Pass the Password variable to the administrator class
        startActivity(intent);
    }

}
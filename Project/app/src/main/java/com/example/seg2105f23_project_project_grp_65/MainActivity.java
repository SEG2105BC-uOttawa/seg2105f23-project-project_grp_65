package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button register;
    public static final String TEXT = "GET_USERNAME_FROM_USER";
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.UsernameText);
    }
    // This is the right Project

    public void openActivity2(View view){
        String text = inputText.getText().toString();
        register = findViewById(R.id.Register);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(TEXT, text);
        startActivity(intent);
    }

}
package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    Button Login; // Variable for the login button.
    EditText UserNameInput2; // Variable for the User Name input
    EditText PasswordInput2; // Variable for the Password input

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Login = findViewById(R.id.BtnLogin);
        UserNameInput2 = findViewById(R.id.LoginUsername); // Get the ID from the TextInput
        PasswordInput2 = findViewById(R.id.LoginPassword); // Get the ID from the IntInput

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName, Password;

                UserName = String.valueOf(UserNameInput2.getText());
                Password = String.valueOf(PasswordInput2.getText());

                if(TextUtils.isEmpty(UserName)){
                    Toast.makeText(LogIn.this,"Please put a Username",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Password)){
                    Toast.makeText(LogIn.this,"Please put a Password",Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });

    }
}
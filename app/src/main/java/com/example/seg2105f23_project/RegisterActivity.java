package com.example.seg2105f23_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity{
    private EditText email;
    private EditText password;
    private Button register;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.login);

        auth = FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String txt_email = email.getText().toString();
               String txt_password = password.getText().toString();

               if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                   Toast.makeText(RegisterActivity.this, "E-mail or password can't be empty!", Toast.LENGTH_SHORT).show();
               } else if (txt_password.length() < 6) {
                   Toast.makeText(RegisterActivity.this, "Password must be at least 6 characters long!", Toast.LENGTH_SHORT).show();
               } else {
                   registerUser(txt_email, txt_password);
               }
            }
        });
    }

    private void registerUser(String txtEmail, String txtPassword) {
        auth.createUserWithEmailAndPassword(txtEmail,txtPassword).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "User successfully registered!", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(RegisterActivity.this, "Registration failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

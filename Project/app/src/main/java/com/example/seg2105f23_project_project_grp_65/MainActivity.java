package com.example.seg2105f23_project_project_grp_65;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.seg2105f23_project_project_grp_65.AdminPackage.Administrator;
import com.example.seg2105f23_project_project_grp_65.EventOrganiserPackage.EventOrganiser;
import com.example.seg2105f23_project_project_grp_65.ParticipantPackage.Participant;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button register; // Variable for the button.
    public static final String TEXT = "com.example.seg2105f23_project_project_grp_65.EXTRA_TEXT"; // Variable for the text
    public static final String NUMBER = "com.example.seg2105f23_project_project_grp_65.EXTRA_NUMBER"; //
    EditText UserNameInput; // Variable for the User Name input
    EditText PasswordInput; // Variable for the Password input
    RadioGroup radioGroup ; // Variable for the RadioGroup
    RadioButton adminRadio; // Variable for the Admin radioButton
    RadioButton eventOrganiserRadio; // Variable for the Event orginiser radioButton
    RadioButton participantRadio; // Variable for the Participant radioButton
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        register = findViewById(R.id.BtnRegister);
        UserNameInput = findViewById(R.id.UsernameText); // Get the ID from the TextInput
        PasswordInput = findViewById(R.id.PasswordText); // Get the ID from the IntInput
        radioGroup = findViewById(R.id.RadioMain2); // Get the ID from the RadioGroup
        adminRadio = findViewById(R.id.radioAdmin);// Get the ID from the admin radio button
        eventOrganiserRadio = findViewById(R.id.radioEventManage);// Get the ID from the eventOrganiser Radio Button
        participantRadio =findViewById(R.id.radioParticipant);// Get the ID from the participant Radio Button

         register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Register button
                String UserName, Password;

                UserName = String.valueOf(UserNameInput.getText());
                Password = String.valueOf(PasswordInput.getText());

                if(TextUtils.isEmpty(UserName)){
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Password)){
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                    return;
                }


                mAuth.createUserWithEmailAndPassword(UserName, Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "Account created",Toast.LENGTH_SHORT).show();
                                    View View = null;
                                    openActivity2(null);
                                }
                                else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(MainActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
    // This is the right Project

    // This method is to open MainActivity2
    //  Is the OnCreate method for the register button

    public void openActivity2(View view){ // This is called by the oncreate
        String UserName, Password;

        UserName = String.valueOf(UserNameInput.getText());
        Password = String.valueOf(PasswordInput.getText());
        int selectedRadioId = radioGroup.getCheckedRadioButtonId();

        if(findViewById(selectedRadioId) == adminRadio){ // If the radio Id of the

            Intent intent = new Intent(this, Administrator.class); // Open the Administrator activity
            intent.putExtra(TEXT, UserName); // Pass the username variable to the administrator class
            intent.putExtra(NUMBER, Password); // Pass the Password variable to the administrator class
            startActivity(intent);

        }
        else if(findViewById(selectedRadioId) == eventOrganiserRadio){
            Intent intent = new Intent(this, EventOrganiser.class); // Open the Administrator activity
            intent.putExtra(TEXT, UserName); // Pass the username variable to the administrator class
            intent.putExtra(NUMBER, Password); // Pass the Password variable to the administrator class
            startActivity(intent);

        }
        else{
            Intent intent = new Intent(this, Participant.class); // Open the Administrator activity
            intent.putExtra(TEXT, UserName); // Pass the username variable to the administrator class
            intent.putExtra(NUMBER, Password); // Pass the Password variable to the administrator class
            startActivity(intent);
        }
    }


}
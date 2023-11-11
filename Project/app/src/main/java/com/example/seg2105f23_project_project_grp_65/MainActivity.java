package com.example.seg2105f23_project_project_grp_65;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.seg2105f23_project_project_grp_65.AdminPackage.Administrator;
import com.example.seg2105f23_project_project_grp_65.EventOrganiserPackage.EventOrganiser;
import com.example.seg2105f23_project_project_grp_65.ParticipantPackage.Participant;

public class MainActivity extends AppCompatActivity {
    private Button register; // Variable for the button.
    public static final String TEXT = "com.example.seg2105f23_project_project_grp_65.EXTRA_TEXT"; // Variable for the text
    public static final String NUMBER = "com.example.seg2105f23_project_project_grp_65.EXTRA_NUMBER"; //
    EditText UserNameInput; // Variable for the User Name input
    EditText PasswordInput; // Variable for the Password input
    RadioGroup radioGroup ; // Variable for the RadioGroup
    RadioButton adminRadio; // Variable for the Admin radioButton
    RadioButton eventOrganiserRadio; // Variable for the Event orginiser radioButton
    RadioButton participantRadio; // Variable for the Participant radioButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserNameInput = findViewById(R.id.UsernameText); // Get the ID from the TextInput
        PasswordInput = findViewById(R.id.PasswordText); // Get the ID from the IntInput
        radioGroup = findViewById(R.id.RadioMain2); // Get the ID from the RadioGroup
        adminRadio = findViewById(R.id.radioAdmin);// Get the ID from the admin radio button
        eventOrganiserRadio = findViewById(R.id.radioEventManage);// Get the ID from the eventOrganiser Radio Button
        participantRadio =findViewById(R.id.radioParticipant);// Get the ID from the participant Radio Button

    }
    // This is the right Project

    // This method is to open MainActivity2
    //  Is the OnCreate method for the register button
    public void openActivity2(View view){
        String UserName ="";
        int Password =0;
        int selectedRadioId = radioGroup.getCheckedRadioButtonId();

        if(UserNameInput.getText().toString().isEmpty()|| PasswordInput.getText().toString().isEmpty()){

            System.out.println("yo mama");
        }
        else {
            UserName = UserNameInput.getText().toString();
            Password = Integer.parseInt(PasswordInput.getText().toString());
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
}
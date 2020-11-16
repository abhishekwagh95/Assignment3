package com.example.assignment3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.ims.RegistrationManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Registration Form");

        EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;


        et1 = findViewById(R.id.EditTextName);
        et2= findViewById(R.id.EditTextDOB);
        et3= findViewById(R.id.EditTextEmailID);
        et4= findViewById(R.id.editTextTextPostalAddress);
        et5 = findViewById(R.id.editTextPhone);
        et6 = findViewById(R.id.pincode);
        et7 = findViewById(R.id.mobile);
        et8 = findViewById(R.id.interest);
        et9 = findViewById(R.id.profile);
        et10 = findViewById(R.id.experience);


        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
                s1= et1.getText() .toString();
                s2= et2.getText() .toString();
                s3= et3.getText() .toString();
                s4= et4.getText() .toString();
                s5= et5.getText() .toString();
                s6= et6.getText() .toString();
                s7= et7.getText() .toString();
                s8= et8.getText() .toString();
                s9= et9.getText() .toString();
                s10= et10.getText() .toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Name", s1);
                intent.putExtra("DOB", s2);
                intent.putExtra("EmailID", s3);
                intent.putExtra("Address", s4);
                intent.putExtra("City", s5);
                intent.putExtra("Pincode", s6);
                intent.putExtra("Mobile", s7);
                intent.putExtra("Interest", s8);
                intent.putExtra("Profile", s9);
                intent.putExtra("Experience", s10);

                startActivity(intent);

            }
        });
    }


}
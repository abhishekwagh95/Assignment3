package com.example.assignment3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Registration Details");

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String dob = intent.getStringExtra("DOB");
        String email = intent.getStringExtra("EmailId");
        String address = intent.getStringExtra("Address");
        String city = intent.getStringExtra("City");
        String pincode = intent.getStringExtra("Pincode");
        String mobile = intent.getStringExtra("Mobile");
        String interest = intent.getStringExtra("Interest");
        String profile = intent.getStringExtra("Profile");
        String experience = intent.getStringExtra("Experience");

        TextView result = findViewById(R.id.result);

        result.setText("Name:\t\t"+name+"\nDOB:\t\t"+dob+"\nEmail ID\t\t"+email+"\nAddress\t\t"+address+"\nCity:\t\t"+city+"\nPincode:\t\t"+pincode+"\nMobile:\t\t"+mobile+"\nInterest:\t\t"+interest+"\nProfile:\t\t"+profile+"\nExperience:\t\t"+experience+"\n");
    }
}
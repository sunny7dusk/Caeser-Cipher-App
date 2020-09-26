package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        TextView firstNameView = findViewById(R.id.firstNameView);
        TextView lastNameView = findViewById(R.id.lastNameView);
        TextView emailView = findViewById(R.id.emailView);

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.email);

        firstNameView.setText("First Name: " + firstName.getText().toString());
        lastNameView.setText("Last Name: " + lastName.getText().toString());
        emailView.setText("Email: " + email.getText().toString());
    }

    //TODO
}

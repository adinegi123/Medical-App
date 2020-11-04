package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Registration extends AppCompatActivity {
    private Button btn2;
    private EditText editemp;
    private EditText editmob;
    private EditText editemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        btn2=findViewById(R.id.btn2);
        editemp=findViewById(R.id.edittext_empcode1);
        editmob=findViewById(R.id.edittext_mob);
        editemail=findViewById(R.id.edittext_email1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,Dashboard.class);
                startActivity(intent);

            }
        };





    }


}

package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.graphics.Paint.UNDERLINE_TEXT_FLAG;

public class MainActivity extends AppCompatActivity {


   // private ImageView bg;
    private EditText editText;
    private EditText editpd;
    private TextView textView2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bg=findViewById(R.id.bgd);
        textView2=findViewById(R.id.textView2);
        editText=findViewById(R.id.edittext_empcode);
        editpd=findViewById(R.id.edittext_emppswd);
        textView3=findViewById(R.id.textView3);
        String udata="Forgot Password?";
        SpannableString content = new SpannableString(udata);
        content.setSpan(new UnderlineSpan(), 0, udata.length(), 0);
        //textView3.setText(content);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Registration.class);
                startActivity(intent);
            }

        });
     //   textView2.paintFlags = textview2.paintFlags or Paint.UNDERLINE_TEXT_FLAG

    }
}

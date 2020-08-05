package com.htsoftworks.challengeone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //All Text inputs in the app
    EditText editText1, editText2, editText3;


    //All Text views in the app
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialization
        //EditTexts
        editText1=findViewById(R.id.firstnametext);
        editText2=findViewById(R.id.lastnametext);
        editText3=findViewById(R.id.emailaddress);


        //TextViews
        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView5);
        textView3 = findViewById(R.id.textView6);
    }

    public void onRegBtnClick(View view){
        //Actual work
        textView1.setText("First name: "+editText1.getText().toString());
        textView2.setText("Last name: "+editText2.getText().toString());
        textView3.setText("Email: "+editText3.getText().toString());

    }
}
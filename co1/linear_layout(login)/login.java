package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button submit;
EditText uname,age,ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname=findViewById(R.id.name);
                age=findViewById(R.id.age);
                ph=findViewById(R.id.phone);
                String c=uname.getText().toString().trim();
                if(c.equals("")){
                    Toast.makeText(MainActivity.this, "enter valid name", Toast.LENGTH_SHORT).show();
                }
                else if(age.getText().toString().trim().equals("") || Integer.parseInt(age.getText().toString())<0){
                    Toast.makeText(MainActivity.this, "enter the age", Toast.LENGTH_SHORT).show();
                }
                else if(ph.getText().toString().trim().equals("") || ph.getText().toString().trim().length()<10){
                    Toast.makeText(MainActivity.this, "enter a valid number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText usn =findViewById(R.id.editTextText);
        EditText pass =findViewById(R.id.editTextText3);
        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( usn.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext() ,"login successfull",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext() ,"login failed",Toast.LENGTH_SHORT).show();

                }
            }
        });



    }




}
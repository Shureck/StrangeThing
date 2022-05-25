package com.example.myapplication11111;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sign_in extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame4);
        Button sign_in_2 = (Button) findViewById(R.id.sign_in_2);
        sign_in_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this, MainActivity.class);
                intent.putExtra("authorised",true);
                startActivity(intent);
            }
        });
    }
}

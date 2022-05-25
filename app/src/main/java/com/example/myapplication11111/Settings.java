package com.example.myapplication11111;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Settings extends AppCompatActivity {

    Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom1:
                    Intent intent = new Intent(Settings.this, Account.class);
                    startActivity(intent);
                    return true;
                case R.id.bottom2:
                    Intent intent2 = new Intent(Settings.this, Maps.class);
                    startActivity(intent2);
                    return true;
                case R.id.bottom3:
                    Intent intent3 = new Intent(Settings.this, MainActivity.class);
                    startActivity(intent3);
                    return true;
                case R.id.bottom4:
                    Intent intent4 = new Intent(Settings.this, Promo.class);
                    startActivity(intent4);
                    return true;
                case R.id.bottom5:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.frame8);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.bottom5);

        Button rtt = findViewById(R.id.history);
        Button rec = findViewById(R.id.rec);
        rtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, History.class);
                startActivity(intent);
            }
        });
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, Rec.class);
                startActivity(intent);
            }
        });
    }
}

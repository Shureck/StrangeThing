package com.example.myapplication11111;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Account extends AppCompatActivity {

    Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom1:
                    return true;
                case R.id.bottom2:
                    Intent intent2 = new Intent(Account.this, Maps.class);
                    startActivity(intent2);
                    return true;
                case R.id.bottom3:
                    Intent intent3 = new Intent(Account.this, MainActivity.class);
                    startActivity(intent3);
                    return true;
                case R.id.bottom4:
                    Intent intent4 = new Intent(Account.this, Promo.class);
                    startActivity(intent4);
                    return true;
                case R.id.bottom5:
                    Intent intent5 = new Intent(Account.this, Settings.class);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.frame7);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.bottom1);
    }
}

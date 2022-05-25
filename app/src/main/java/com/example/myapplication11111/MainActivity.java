package com.example.myapplication11111;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    MyRecyclerViewAdapter adapter;
    Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom1:
                    Intent intent = new Intent(MainActivity.this, Account.class);
                    startActivity(intent);
                    return true;
                case R.id.bottom2:
                    Intent intent2 = new Intent(MainActivity.this, Maps.class);
                    startActivity(intent2);
                    return true;
                case R.id.bottom3:
                    return true;
                case R.id.bottom4:
                    Intent intent4 = new Intent(MainActivity.this, Promo.class);
                    startActivity(intent4);
                    return true;
                case R.id.bottom5:
                    Intent intent5 = new Intent(MainActivity.this, Settings.class);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame6);



        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.bottom3);
        Intent intent2 = getIntent();
        boolean auth = intent2.getBooleanExtra("authorised",false);
        System.out.println("SSSSSSSSS "+auth);
        if (!auth){
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        }
        else{

        }

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(new MyRecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
//        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment,new)
    }
}
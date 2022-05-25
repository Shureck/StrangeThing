package com.example.myapplication11111;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;

public class Rec extends AppCompatActivity {

    NewAdapterRec adapter;
    Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom1:
                    Intent intent = new Intent(Rec.this, Account.class);
                    startActivity(intent);
                    return true;
                case R.id.bottom2:
                    Intent intent2 = new Intent(Rec.this, Maps.class);
                    startActivity(intent2);
                    return true;
                case R.id.bottom3:
                    Intent intent3 = new Intent(Rec.this, MainActivity.class);
                    startActivity(intent3);
                    return true;
                case R.id.bottom4:
                    Intent intent4 = new Intent(Rec.this, Promo.class);
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
        setContentView(R.layout.frame9);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.bottom5);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recCeec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewAdapterRec(this, animalNames);
        adapter.setClickListener(new NewAdapterRec.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Rec.this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
//        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment,new)
    }
}


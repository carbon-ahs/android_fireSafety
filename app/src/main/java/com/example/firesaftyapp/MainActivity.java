package com.example.firesaftyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] building_types;
    String building_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView nextBtn = findViewById(R.id.nextBtn);
        Spinner building_type_spinner = findViewById(R.id.building_type_spinner);
        building_types = getResources().getStringArray(R.array.building_type);

        ArrayAdapter<String> adepter = new ArrayAdapter<>(this, R.layout.spinner_view, R.id.building_typeTV, building_types);
        building_type_spinner.setAdapter(adepter);

        nextBtn.setOnClickListener(view -> {
            building_type = building_type_spinner.getSelectedItem().toString();
            if (building_type.charAt(0) != 'O'){
                Intent intent = new Intent(MainActivity.this, SubTypeActivity.class);
                intent.putExtra("building_type", building_type);
                startActivity(intent);
            }


        });


    }
}
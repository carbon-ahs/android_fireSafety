package com.example.firesaftyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class SubTypeActivity extends AppCompatActivity {
    String[] sub_types;
    String building_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_type);

        TextView subTypeHeader = findViewById(R.id.sub_type_header);
        Bundle bundle = getIntent().getExtras();
        building_type = bundle.getString("building_type");
        subTypeHeader.setText(building_type);

        ImageView nextBtn = findViewById(R.id.nextBtn);
        Spinner sub_type_spinner = findViewById(R.id.sub_type_spinner);

        switch (building_type.charAt(0)) {
            case 'A':
                sub_types = getResources().getStringArray(R.array.residential_types);
                break;
            case 'B':
                sub_types = getResources().getStringArray(R.array.educational_types);
                break;
            case 'C':
                sub_types = getResources().getStringArray(R.array.care_types);
                break;
            case 'D':
                sub_types = getResources().getStringArray(R.array.health_care_types);
                break;
            case 'E':
                sub_types = getResources().getStringArray(R.array.business_types);
                break;
            case 'F':
                sub_types = getResources().getStringArray(R.array.mercantile_types);
                break;
            case 'G':
                sub_types = getResources().getStringArray(R.array.industry_types);
                break;
            case 'H':
                sub_types = getResources().getStringArray(R.array.storage_types);
                break;
            case 'I':
                sub_types = getResources().getStringArray(R.array.assembly_types);
                break;
        }

        ArrayAdapter<String> adepter = new ArrayAdapter<>(this, R.layout.spinner_view, R.id.building_typeTV, sub_types);
        sub_type_spinner.setAdapter(adepter);
    }
}
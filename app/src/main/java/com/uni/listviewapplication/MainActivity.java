package com.uni.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] phones = {"09122350000", "09122350001", "09122350002", "09122350003", "09122350004"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // alt + Enter @SuppressLint("MissingInflatedId")
        listView = findViewById(R.id.listView_1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, phones);
        listView.setAdapter(adapter);

    }
}
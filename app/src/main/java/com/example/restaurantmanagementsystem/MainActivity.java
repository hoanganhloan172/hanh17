package com.example.restaurantmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.restaurantmanagementsystem.database.ContextDatabase;
import com.example.restaurantmanagementsystem.entity.User;

public class MainActivity extends AppCompatActivity {

    private TextView contact, order, mycustomer,orderhistory, userprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
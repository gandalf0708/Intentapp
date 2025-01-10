package com.example.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openBrowserButton = findViewById(R.id.openBrowserButton);
        Button callPhoneButton = findViewById(R.id.callPhoneButton);
        Button shareTextButton = findViewById(R.id.shareTextButton);

        // פתיחת דפדפן
        openBrowserButton.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(browserIntent);
        });

        // שיחת טלפון
        callPhoneButton.setOnClickListener(view -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
            startActivity(callIntent);
        });

        // מעבר ל-ShareActivity
        shareTextButton.setOnClickListener(view -> {
            Intent shareIntent = new Intent(MainActivity.this, ShareActivity.class);
            startActivity(shareIntent);
        });
    }
}
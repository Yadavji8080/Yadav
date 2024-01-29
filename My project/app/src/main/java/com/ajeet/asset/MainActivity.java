package com.ajeet.asset;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ajeet.asset.Unused.DetectedFragment;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String detectedObject = intent.getStringExtra("Detected Object");
        Bundle bundle = new Bundle();
        bundle.putString("detectedObject", detectedObject);
        fragment = new DetectedFragment();
        fragment.setArguments(bundle);


        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_area, fragment);
        ft.commit();
    }
}

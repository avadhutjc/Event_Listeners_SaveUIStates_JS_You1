package com.masai.a429july_eventlistenersandsaveuistatesjs_you1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTvHeyMasai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Lloyd","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvHeyMasai = findViewById(R.id.tvMasai);
        mTvHeyMasai.setText("Hey Masai");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "Screen Rotation");
        Log.d("TAG", "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String data = savedInstanceState.getString("key");
        mTvHeyMasai.setText(data);
        Log.d("TAG", "onRestoreInstanceState");
    }
}
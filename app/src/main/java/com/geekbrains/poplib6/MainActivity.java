package com.geekbrains.poplib6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.geekbrains.poplib6.dagger.App;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getAppComponent().inject(this);

        Red red = new Red();
        White white = new White();
    }
}

package com.geekbrains.poplib6;

import android.util.Log;

import com.geekbrains.poplib6.dagger.App;

import javax.inject.Inject;

public class Red{

    @Inject
    Green green;

    Red() {
        App.getAppComponent().inject(this);

        Log.d("Red","Green message="+green.show());
        Log.d("Red","Green class="+green.toString());
    }
}

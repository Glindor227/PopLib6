package com.geekbrains.poplib6;

import android.util.Log;

import com.geekbrains.poplib6.dagger.App;

import javax.inject.Inject;

public class White{
    @Inject
    Green green;

    White() {
        App.getAppComponent().inject(this);
        Log.d("White","Green message="+green.show());
        Log.d("White","Green class="+green.toString());
    }
}

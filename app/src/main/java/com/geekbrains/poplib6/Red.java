package com.geekbrains.poplib6;

import android.util.Log;

class Red{
    private Green green;
    Red(Green inGreen) {
        this.green = inGreen;
        Log.d("Red","Green message="+green.show());
        Log.d("Red","Green class="+green.toString());
    }
}

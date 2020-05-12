package com.geekbrains.poplib6;

import android.util.Log;


class White{
    private Green green;
    White(Green inGreen) {
        this.green = inGreen;
        Log.d("White","Green message="+green.show());
        Log.d("White","Green class="+green.toString());
    }
}

package io.husky.android.libtest;

import android.util.Log;

public class Lib {

    public static String testeLib(String arg1, String arg2) {
        Log.i("Lib", "arg1: " + arg1);
        return arg2;
    }

}

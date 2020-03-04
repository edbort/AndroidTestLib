package io.husky.android.libtest;

import android.content.Context;
import android.content.Intent;

import io.husky.android.libtest.activity.AccessActivity;

public class Lib extends CordovaPlugin {

    public static void criaConta(Context context, String jsonArgs, String callback) {
        Intent i = new Intent(context, AccessActivity.class);
        context.startActivity(i);
    }

}
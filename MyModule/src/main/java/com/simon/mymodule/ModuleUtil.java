package com.simon.mymodule;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by xw on 2016/6/29.
 */
public class ModuleUtil {
    public static String TAG = ModuleUtil.class.getSimpleName();

    public static void moduleMethod(Context context) {
        Log.i(TAG, "moduleMethod: moduleMethod");
        Toast.makeText(context, "MyApp get MyModule method", Toast.LENGTH_SHORT).show();
    }

}

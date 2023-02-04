package exp.injection;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static void injectIllegalArgumentException (int id ,Context context){
        try {
            Log.i(TAG,"injectIllegalArgumentException begin");
            context.deleteFile("sdcard/test.png");
        } finally {
            Log.i(TAG,"injectIllegalArgumentException after");
        }
    }
}

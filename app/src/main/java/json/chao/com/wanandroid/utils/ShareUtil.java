package json.chao.com.wanandroid.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import json.chao.com.wanandroid.annotationtest.DoubleClickTest;

/**
 * Created by codeest on 2016/8/22.
 */
public class ShareUtil {

    private static final String EMAIL_ADDRESS = "chao.qu521@gmail.com";

    public static void shareText(Context context,String text,String title){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,text);
        context.startActivity(Intent.createChooser(intent,title));
    }

    public static void sendEmail(Context context, String title) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(
                "mailto:" + EMAIL_ADDRESS));
        context.startActivity(Intent.createChooser(intent, title));
    }


    @DoubleClickTest(time = 2000)
    public void checkCode(int time) {
        Log.i("zxy--", "checkCode: time : " + time);
    }

}

package com.hengtiansoft.toast;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Toast;

/**
 * ProjectName：ToastUtil
 * PackageName: com.hengtiansoft.toast
 * Description：
 *
 * @author zhuoyilu
 * Modifier：zhuoyilu
 * ModifyTime：2017/7/11 13:30
 * Comment：
 */

public class ToastUtil {
    private static Context context = BasicApplication.getAppContext();
    private static Toast mToast;

    public static void show(int resId) {
        show(context.getResources().getText(resId), Toast.LENGTH_SHORT);
    }

    public static void show(int resId, int duration) {
        show(context.getResources().getText(resId), duration);
    }

    public static void show(CharSequence text) {
        show(text, Toast.LENGTH_SHORT);
    }

    public static void show(CharSequence text, int duration) {
        text = TextUtils.isEmpty(text == null ? "" : text.toString()) ? "unknown error"
                : text;
        if (mToast == null) {
            mToast = Toast.makeText(context, text, duration);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }

    public static void show(int resId, Object... args) {
        show(String.format(context.getResources().getString(resId), args),
                Toast.LENGTH_SHORT);
    }

    public static void show(String format, Object... args) {
        show(String.format(format, args), Toast.LENGTH_SHORT);
    }

    public static void show(int resId, int duration, Object... args) {
        show(String.format(context.getResources().getString(resId), args),
                duration);
    }

    public static void show(String format, int duration, Object... args) {
        show(String.format(format, args), duration);
    }


    public static void show(CharSequence text, Context context) {
        text = TextUtils.isEmpty(text == null ? "" : text.toString()) ? "unknown error"
                : text;
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
            mToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mToast.setGravity(Gravity.CENTER, 0, 0);
            mToast.setText(text);
        }
        mToast.show();
    }
}

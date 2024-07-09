package com.RNFetchBlob.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/**
 * @author:OP078081
 * @eamil:jiangbo.mi@opple.com
 * @description: todo
 * @date: 2024/7/8
 **/
public class CompatReceviceHelp {

    public static void compatRegisterReceiver(
            Context context, BroadcastReceiver receiver, IntentFilter filter, boolean exported) {
        if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
            context.registerReceiver(
                    receiver, filter, exported ? Context.RECEIVER_EXPORTED : Context.RECEIVER_NOT_EXPORTED);
        } else {
            context.registerReceiver(receiver, filter);
        }
    }
}

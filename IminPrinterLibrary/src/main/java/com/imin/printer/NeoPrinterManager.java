package com.imin.printer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author dzm
 * Created by dzm on 2022/12/15.
 */
public class NeoPrinterManager {
    private static final String TAG = "NeoPrinterLibrary_NeoPrinterManager";
    private NeoPrinterManager() {
    }

    public static NeoPrinterManager getInstance() {
        return NeoPrinterManager.SingletonContainer.instance;
    }

    public boolean bindService(Context mContext, ServiceConnectionCallback callback){
        if (mContext != null && callback != null) {
            Log.d(TAG,mContext.getPackageName() + " bindService!");
            Intent intent = new Intent();
            intent.setAction("com.imin.printerservice.NeoPrinterService");
            intent.setComponent(new ComponentName("com.imin.printerservice", "com.imin.printerservice.core.ApiAdapterManager.NeoPrinterService"));
            return mContext.getApplicationContext().bindService(intent, callback, Context.BIND_AUTO_CREATE);
        }else {
            Log.e(TAG,"bindService parameter must be not null!");
        }
        return false;
    }

    public void unBindService(Context mContext, ServiceConnectionCallback callback){
        if (mContext != null && callback != null) {
            Log.d(TAG,mContext.getPackageName() + " unBindService!");
            mContext.getApplicationContext().unbindService(callback);
        }else {
            Log.e(TAG,"unBindService parameter must be not null!");
        }
    }

    private static class SingletonContainer {
        private final static NeoPrinterManager instance = new NeoPrinterManager();

        private SingletonContainer() {
        }
    }
}

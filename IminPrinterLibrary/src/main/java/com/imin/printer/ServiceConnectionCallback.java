package com.imin.printer;

/**
 * @author dzm
 * Created by dzm on 2022/12/15.
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public abstract class ServiceConnectionCallback implements ServiceConnection {
    public ServiceConnectionCallback() {
    }

    protected abstract void onConnected(INeoPrinterService service);

    protected abstract void onDisconnected();

    public void onServiceConnected(ComponentName name, IBinder service) {
        if (service != null) {
            INeoPrinterService proxy = INeoPrinterService.Stub.asInterface(service);
            this.onConnected(proxy);
        }
    }

    public void onServiceDisconnected(ComponentName name) {
        this.onDisconnected();
    }
}

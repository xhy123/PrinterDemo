package com.sunmi.peripheral.printer;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;

import java.util.Locale;


/**
 * Created by Administrator on 2017/7/28.
 */

public class InnerPrinterManager {

    private InnerPrinterManager(){
    }
    private static class SingletonContainer{
        private static InnerPrinterManager instance = new InnerPrinterManager();
    }
    public static InnerPrinterManager getInstance(){
        return SingletonContainer.instance;
    }

    public boolean bindService(Context mContext, InnerPrinterCallback callback) throws InnerPrinterException {
        if(mContext == null || callback == null){
            throw new InnerPrinterException("parameter must be not null!");
        }
        Intent intent = new Intent();
        intent.setPackage("woyou.aidlservice.jiuiv5");
        intent.setAction("woyou.aidlservice.jiuiv5.IWoyouService");
        return mContext.getApplicationContext().bindService(intent, callback, Context.BIND_AUTO_CREATE);
    }

    public void unBindService(Context mContext, InnerPrinterCallback callback) throws InnerPrinterException {
        if(mContext == null || callback == null){
            throw new InnerPrinterException("parameter must be not null!");
        }
        mContext.getApplicationContext().unbindService(callback);
    }

    public boolean hasPrinter(SunmiPrinterService sunmiPrinterService) throws InnerPrinterException {
        if(sunmiPrinterService == null){
            throw new InnerPrinterException("printer service does not exist!");
        }
        try {
            int status = sunmiPrinterService.updatePrinterState();
            if(status == 0 || status == 505){
                return false;
            }else{
                return true;
            }
        } catch (RemoteException e) {
            if(Build.SERIAL.toUpperCase(Locale.ENGLISH).contains("V1")){
                return true;
            }else{
                return false;
            }
        }
    }
}

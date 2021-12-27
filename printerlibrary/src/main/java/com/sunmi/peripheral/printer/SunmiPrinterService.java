package com.sunmi.peripheral.printer;

import android.os.Build;
import android.os.RemoteException;

import java.util.Locale;

/**
 * @author kaltin
 */
public interface SunmiPrinterService extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements SunmiPrinterService {
        private static final String DESCRIPTOR = "woyou.aidlservice.jiuiv5.IWoyouService";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an  IWoyouServiceT1 interface,
         * generating a proxy if needed.
         */
        public static SunmiPrinterService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof SunmiPrinterService))) {
                return ((SunmiPrinterService) iin);
            }
            return new Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_updateFirmware: {
                    data.enforceInterface(DESCRIPTOR);
                    this.updateFirmware();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getFirmwareStatus: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getFirmwareStatus();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getServiceVersion: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getServiceVersion();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_printerInit: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback) ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printerInit(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printerSelfChecking: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printerSelfChecking(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterSerialNo: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterSerialNo();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrinterVersion: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterVersion();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrinterModal: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterModal();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrintedLength: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0 =
                            (InnerResultCallback) ICallback.Stub.asInterface(data.readStrongBinder());
                    this.getPrintedLength(_arg0);
                    int _result = 0;
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_lineWrap: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.lineWrap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendRAWData: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.sendRAWData(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setAlignment: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setAlignment(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setFontName: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setFontName(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setFontSize: {
                    data.enforceInterface(DESCRIPTOR);
                    float _arg0;
                    _arg0 = data.readFloat();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setFontSize(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printText: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printText(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printTextWithFont: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    String _arg1;
                    _arg1 = data.readString();
                    float _arg2;
                    _arg2 = data.readFloat();
                    InnerResultCallback _arg3;
                    _arg3 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printTextWithFont(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printColumnsText: {
                    data.enforceInterface(DESCRIPTOR);
                    String[] _arg0;
                    _arg0 = data.createStringArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    int[] _arg2;
                    _arg2 = data.createIntArray();
                    InnerResultCallback _arg3;
                    _arg3 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printColumnsText(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printBitmap: {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBitmap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printBarCode: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _arg4;
                    _arg4 = data.readInt();
                    InnerResultCallback _arg5;
                    _arg5 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printQRCode: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    InnerResultCallback _arg3;
                    _arg3 = (InnerResultCallback) ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printQRCode(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printOriginalText: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printOriginalText(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrint: {
                    data.enforceInterface(DESCRIPTOR);
                    TransBean[] _arg0;
                    _arg0 = data.createTypedArray(TransBean.CREATOR);
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.commitPrint(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    this.commitPrinterBuffer();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_cutPaper: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.cutPaper(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getCutPaperTimes: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getCutPaperTimes();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_openDrawer: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.openDrawer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getOpenDrawerTimes: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getOpenDrawerTimes();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_enterPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.enterPrinterBuffer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_exitPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.exitPrinterBuffer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_tax: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    InnerTaxCallback _arg1;
                    _arg1 = (InnerTaxCallback) ITax.Stub.asInterface(data.readStrongBinder());
                    this.tax(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterFactory: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.getPrinterFactory(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_clearBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    this.clearBuffer();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrinterBufferWithCallback: {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.commitPrinterBufferWithCallback(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_exitPrinterBufferWithCallback: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    InnerResultCallback _arg1;
                    _arg1 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.exitPrinterBufferWithCallback(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printColumnsString: {
                    data.enforceInterface(DESCRIPTOR);
                    String[] _arg0;
                    _arg0 = data.createStringArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    int[] _arg2;
                    _arg2 = data.createIntArray();
                    InnerResultCallback _arg3;
                    _arg3 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printColumnsString(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_updatePrinterState: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.updatePrinterState();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_sendLCDCommand: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.sendLCDCommand(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendLCDString: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    InnerLcdCallback _arg1;
                    _arg1 = (InnerLcdCallback) ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDString(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendLCDBitmap: {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    InnerLcdCallback _arg1;
                    _arg1 = (InnerLcdCallback)ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDBitmap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterMode:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterMode();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getPrinterBBMDistance:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterBBMDistance();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_printBitmapCustom:
                {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0!=data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    }
                    else {
                        _arg0 = null;
                    }
                    int _arg1;
                    _arg1 = data.readInt();
                    InnerResultCallback _arg2;
                    _arg2 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBitmapCustom(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getForcedDouble:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getForcedDouble();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_isForcedAntiWhite:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedAntiWhite();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_isForcedBold:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedBold();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_isForcedUnderline:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedUnderline();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_getForcedRowHeight:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getForcedRowHeight();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getFontName:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getFontName();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_sendLCDDoubleString:
                {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    String _arg1;
                    _arg1 = data.readString();
                    InnerLcdCallback _arg2;
                    _arg2 = (InnerLcdCallback)ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDDoubleString(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterPaper:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterPaper();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getDrawerStatus:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.getDrawerStatus();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_sendLCDFillString:
                {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    boolean _arg2;
                    _arg2 = (0!=data.readInt());
                    InnerLcdCallback _arg3;
                    _arg3 = (InnerLcdCallback)ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDFillString(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendLCDMultiString:
                {
                    data.enforceInterface(DESCRIPTOR);
                    String[] _arg0;
                    _arg0 = data.createStringArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    InnerLcdCallback _arg2;
                    _arg2 = (InnerLcdCallback)ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDMultiString(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterDensity:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterDensity();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_print2DCode:
                {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    InnerResultCallback _arg4;
                    _arg4 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.print2DCode(_arg0, _arg1, _arg2, _arg3, _arg4);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_autoOutPaper:
                {
                    data.enforceInterface(DESCRIPTOR);
                    InnerResultCallback _arg0;
                    _arg0 = (InnerResultCallback)ICallback.Stub.asInterface(data.readStrongBinder());
                    this.autoOutPaper(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setPrinterStyle:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    int _arg1;
                    _arg1 = data.readInt();
                    this.setPrinterStyle(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_labelLocate:
                {
                    data.enforceInterface(DESCRIPTOR);
                    this.labelLocate();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_labelOutput:
                {
                    data.enforceInterface(DESCRIPTOR);
                    this.labelOutput();
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        public static class Proxy implements SunmiPrinterService {
            private android.os.IBinder mRemote;
            private int[] transaction_table;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
                setTable();
            }

            private void setTable() {
                String model = Build.MODEL.toUpperCase(Locale.ENGLISH);
                if(model.contains("V2") || model.contains("P2") || model.contains("P1")
                        || model.contains("V1S") || "QBAO_H1".equals(model)){
                    transaction_table = Stub.TRANSCTION_DATASHEET[0];
                }else if(model.contains("MINI") && (model.contains("T1") || model.contains("T2"))){
                    transaction_table = Stub.TRANSCTION_DATASHEET[1];
                }else if(model.contains("V1")){
                    transaction_table = Stub.TRANSCTION_DATASHEET[2];
                }else if(model.contains("T1") || model.contains("T2") || model.contains("S2")){
                    transaction_table = Stub.TRANSCTION_DATASHEET[3];
                }else{
                    transaction_table = Stub.TRANSCTION_DATASHEET[4];
                }
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public void updateFirmware() throws RemoteException {
                throw new InnerPrinterException(ExceptionConst.IP_SYSTEM_CALL);
                /*android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_updateFirmware, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }*/
            }

            @Override
            public int getFirmwareStatus() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getFirmwareStatus, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public String getServiceVersion() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void printerInit(InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printerInit, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printerSelfChecking(InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _reply.readException();
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public String getPrinterSerialNo() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterSerialNo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public String getPrinterVersion() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public String getPrinterModal() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterModal, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void getPrintedLength(InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();

                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
                    _reply.readException();
                    if(_reply.dataAvail() == 4){
                        int _result = _reply.readInt();
                        if(callback != null && _result != -1){
                            callback.onReturnString(String.valueOf(_result));
                        }
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void lineWrap(int n, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(n);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_lineWrap, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void sendRAWData(byte[] data, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(data);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void setAlignment(int alignment, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(alignment);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void setFontName(String typeface, InnerResultCallback callback) throws RemoteException {
                throw new InnerPrinterException(ExceptionConst.IP_INVALID_CALL);
         /*       android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(typeface);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setFontName, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }*/
            }

            @Override
            public void setFontSize(float fontsize, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeFloat(fontsize);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setFontSize, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printText(String text, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printTextWithFont(String text, String typeface, float fontsize, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeString(typeface);
                    _data.writeFloat(fontsize);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printTextWithFont, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringArray(colsTextArr);
                    _data.writeIntArray(colsWidthArr);
                    _data.writeIntArray(colsAlign);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printBitmap(android.graphics.Bitmap bitmap, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap != null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printBarCode(String data, int symbology, int height, int width, int textposition, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    _data.writeInt(symbology);
                    _data.writeInt(height);
                    _data.writeInt(width);
                    _data.writeInt(textposition);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printQRCode(String data, int modulesize, int errorlevel, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    _data.writeInt(modulesize);
                    _data.writeInt(errorlevel);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printOriginalText(String text, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printOriginalText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void commitPrint(TransBean[] transbean, InnerResultCallback callback) throws RemoteException {
                if(transaction_table[19] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeTypedArray(transbean, 0);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrint, _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void commitPrinterBuffer() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer + transaction_table[0], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void cutPaper(InnerResultCallback callback) throws RemoteException {
                if(transaction_table[10] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_cutPaper + transaction_table[10], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getCutPaperTimes() throws RemoteException {
                if(transaction_table[11] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getCutPaperTimes + transaction_table[11], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void openDrawer(InnerResultCallback callback) throws RemoteException {
                if(transaction_table[12] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_openDrawer + transaction_table[12], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getOpenDrawerTimes() throws RemoteException {
                if(transaction_table[13] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getOpenDrawerTimes + transaction_table[13], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void enterPrinterBuffer(boolean clean) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((clean) ? (1) : (0)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer + transaction_table[1], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void exitPrinterBuffer(boolean commit) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((commit) ? (1) : (0)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer + transaction_table[2], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void tax(byte[] data, InnerTaxCallback callback) throws RemoteException {
                if(transaction_table[3] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(data);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_tax + transaction_table[3], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void getPrinterFactory(InnerResultCallback callback) throws RemoteException {
                if(transaction_table[4] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterFactory + transaction_table[4], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void clearBuffer() throws RemoteException {
                if(transaction_table[5] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_clearBuffer + transaction_table[5], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void commitPrinterBufferWithCallback(InnerResultCallback callback) throws RemoteException {
                if(transaction_table[6] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrinterBufferWithCallback + transaction_table[6], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void exitPrinterBufferWithCallback(boolean commit, InnerResultCallback callback) throws RemoteException {
                if(transaction_table[6] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((commit) ? (1) : (0)));
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_exitPrinterBufferWithCallback + transaction_table[7], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printColumnsString(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, InnerResultCallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringArray(colsTextArr);
                    _data.writeIntArray(colsWidthArr);
                    _data.writeIntArray(colsAlign);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_printColumnsString + transaction_table[8], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int updatePrinterState() throws RemoteException {
                if(transaction_table[9] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_updatePrinterState + transaction_table[9], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void sendLCDCommand(int flag) throws RemoteException {
                if(transaction_table[14] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(flag);
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDCommand +transaction_table[14], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }


            @Override
            public void sendLCDString(String string, InnerLcdCallback callback) throws RemoteException {
                if(transaction_table[15] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(string);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDString + transaction_table[15], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void sendLCDBitmap(android.graphics.Bitmap bitmap, InnerLcdCallback callback) throws RemoteException {
                if(transaction_table[16] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap != null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDBitmap + transaction_table[16], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public int getPrinterMode() throws RemoteException
            {
                if(transaction_table[17] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterMode + transaction_table[17], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public int getPrinterBBMDistance() throws RemoteException
            {
                if(transaction_table[18] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterBBMDistance + transaction_table[18], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, InnerResultCallback callback) throws RemoteException
            {
                if(transaction_table[20] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap!=null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(type);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_printBitmapCustom + transaction_table[20], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getForcedDouble() throws RemoteException
            {
                if(transaction_table[21] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getForcedDouble + transaction_table[21], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isForcedAntiWhite() throws RemoteException
            {
                if(transaction_table[22] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedAntiWhite + transaction_table[22], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isForcedBold() throws RemoteException
            {
                if(transaction_table[23] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedBold + transaction_table[23], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public boolean isForcedUnderline() throws RemoteException
            {
                if(transaction_table[24] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedUnderline + transaction_table[24], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int getForcedRowHeight() throws RemoteException
            {
                if(transaction_table[25] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getForcedRowHeight + transaction_table[25], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int getFontName() throws RemoteException
            {
                if(transaction_table[26] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getFontName + transaction_table[26], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void sendLCDDoubleString(String topText, String bottomText, InnerLcdCallback callback) throws RemoteException
            {
                if(transaction_table[27] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(topText);
                    _data.writeString(bottomText);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDDoubleString + transaction_table[27], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getPrinterPaper() throws RemoteException
            {
                if(transaction_table[28] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterPaper + transaction_table[28], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public boolean getDrawerStatus() throws RemoteException
            {
                if(transaction_table[29] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getDrawerStatus + transaction_table[29], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public void sendLCDFillString(String string, int size, boolean fill, InnerLcdCallback callback) throws RemoteException
            {
                if(transaction_table[30] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(string);
                    _data.writeInt(size);
                    _data.writeInt(((fill)?(1):(0)));
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDFillString + transaction_table[30], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public void sendLCDMultiString(String[] text, int[] align, InnerLcdCallback callback) throws RemoteException
            {
                if(transaction_table[31] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringArray(text);
                    _data.writeIntArray(align);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDMultiString + transaction_table[31], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public int getPrinterDensity() throws RemoteException
            {
                if(transaction_table[32] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterDensity + transaction_table[32], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public void print2DCode(String data, int symbology, int modulesize, int errorlevel, InnerResultCallback callback) throws RemoteException
            {
                if(transaction_table[33] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    _data.writeInt(symbology);
                    _data.writeInt(modulesize);
                    _data.writeInt(errorlevel);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_print2DCode + transaction_table[33], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public void autoOutPaper(InnerResultCallback callback) throws RemoteException
            {
                if(transaction_table[34] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_autoOutPaper + transaction_table[34], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public void setPrinterStyle(int key, int value) throws RemoteException
            {
                if(transaction_table[35] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(key);
                    _data.writeInt(value);
                    boolean res =
                            mRemote.transact(Stub.TRANSACTION_setPrinterStyle + transaction_table[35],
                                    _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public void labelLocate() throws RemoteException
            {
                if(transaction_table[36] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res =
                            mRemote.transact(Stub.TRANSACTION_labelLocate + transaction_table[36],
                                    _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public void labelOutput() throws RemoteException
            {
                if(transaction_table[37] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException(ExceptionConst.IP_MODEL_CALL);
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res =
                            mRemote.transact(Stub.TRANSACTION_labelOutput + transaction_table[37],
                                    _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException(ExceptionConst.IP_VERSION_CALL);
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

        }

        //int[] transaction_table is offset
        //0: TRANSACTION_commitPrinterBuffer
        //1: TRANSACTION_enterPrinterBuffer
        //2: TRANSACTION_exitPrinterBuffer
        //3: TRANSACTION_tax
        //4: TRANSACTION_getPrinterFactory
        //5: TRANSACTION_clearBuffer
        //6: TRANSACTION_commitPrinterBufferWithCallback
        //7: TRANSACTION_exitPrinterBufferWithCallback
        //8: TRANSACTION_printColumnsString
        //9: TRANSACTION_updatePrinterState
        //10:TRANSACTION_cutPaper
        //11:TRANSACTION_getCutPaperTimes
        //12:TRANSACTION_openDrawer
        //13:TRANSACTION_getOpenDrawerTimes
        //14:TRANSACTION_sendLCDCommand
        //15:TRANSACTION_sendLCDString
        //16:TRANSACTION_sendLCDBitmap
        //17:TRANSACTION_getPrinterMode
        //18:TRANSACTION_getPrinterBBMDistance
        //19:TRANSACTION_commitPrint
        //20:TRANSACTION_printBitmapCustom
        //21:TRANSACTION_getForcedDouble
        //22:TRANSACTION_isForcedAntiWhite
        //23:TRANSACTION_isForcedBold
        //24:TRANSACTION_isForcedUnderline
        //25:TRANSACTION_getForcedRowHeight
        //26:TRANSACTION_getFontName
        //27:TRANSACTION_sendLCDDoubleString
        //28:TRANSACTION_getPrinterPaper
        //29:TRANSACTION_getDrawerStatus
        //30:TRANSACTION_sendLCDFillString
        //31:TRANSACTION_sendLCDMultiString
        //32:TRANSACTION_getPrinterDensity
        //33:TRANSACTION_print2DCode
        //34:TRANSACTION_autoOutPaper
        //35:TRANSACTION_setPrinterStyle
        //36:TRANSACTION_labelLocate
        //37:TRANSACTION_labelOutput
        static final int[][] TRANSCTION_DATASHEET = new int[][]{
                //P1、P14g、P2pro、V1s、V2pro
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 5, Stub.TRANSACTION_STOP, 0,
                        -9, -9, -9, -9, -9, -9, -9, Stub.TRANSACTION_STOP, -8, Stub.TRANSACTION_STOP,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -14, -14, -13, -13, -12, -12},
                //T1mini、T2mini
                {-1, 3, 3, 3, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 8, 8, 1, 1,
                        -10, -10, -10, -10, -3, -3, -3, -10, -10, Stub.TRANSACTION_STOP,
                        -2, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -10, -4, -10,
                        -10, -10, -10, -10, -9, -9, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
                //V1
                {0, 0, 0, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -5, 7,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 0,
                        -15, -15, -15, -15, -15, -15, -15, Stub.TRANSACTION_STOP, -14, Stub.TRANSACTION_STOP,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -20, -20, -19, -19, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
                //T1、T2、S2、K2mini
                {-1, 3, 3, 3, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 5, 5, 1, 1,
                        -10, -10, -10, -10, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -10, -10, Stub.TRANSACTION_STOP,
                        -6, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -13, -13,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -15, -15, Stub.TRANSACTION_STOP, -16, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
               //其他 机型
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0},
        };

        static final int TRANSACTION_STOP = 9527;

        static final int TRANSACTION_updateFirmware = (android.os.IBinder.FIRST_CALL_TRANSACTION);
        static final int TRANSACTION_getFirmwareStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_printerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getPrinterSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_getPrinterModal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_getPrintedLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_lineWrap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_setFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_setFontSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_printTextWithFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_printOriginalText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);

        static final int TRANSACTION_commitPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_tax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
        static final int TRANSACTION_getPrinterFactory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
        static final int TRANSACTION_clearBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
        static final int TRANSACTION_commitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
        static final int TRANSACTION_exitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
        static final int TRANSACTION_printColumnsString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
        static final int TRANSACTION_updatePrinterState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
        static final int TRANSACTION_cutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
        static final int TRANSACTION_getCutPaperTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
        static final int TRANSACTION_openDrawer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
        static final int TRANSACTION_getOpenDrawerTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
        static final int TRANSACTION_sendLCDCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
        static final int TRANSACTION_sendLCDString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
        static final int TRANSACTION_sendLCDBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
        static final int TRANSACTION_getPrinterMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
        static final int TRANSACTION_getPrinterBBMDistance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
        static final int TRANSACTION_printBitmapCustom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
        static final int TRANSACTION_getForcedDouble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
        static final int TRANSACTION_isForcedAntiWhite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
        static final int TRANSACTION_isForcedBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
        static final int TRANSACTION_isForcedUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
        static final int TRANSACTION_getForcedRowHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
        static final int TRANSACTION_getFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
        static final int TRANSACTION_sendLCDDoubleString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
        static final int TRANSACTION_getPrinterPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
        static final int TRANSACTION_getDrawerStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
        static final int TRANSACTION_sendLCDFillString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
        static final int TRANSACTION_sendLCDMultiString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
        static final int TRANSACTION_getPrinterDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
        static final int TRANSACTION_print2DCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
        static final int TRANSACTION_autoOutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
        static final int TRANSACTION_setPrinterStyle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
        static final int TRANSACTION_labelLocate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
        static final int TRANSACTION_labelOutput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
    }

    public void updateFirmware() throws RemoteException;

    public int getFirmwareStatus() throws RemoteException;

    public String getServiceVersion() throws RemoteException;

    public void printerInit(InnerResultCallback callback) throws RemoteException;

    public void printerSelfChecking(InnerResultCallback callback) throws RemoteException;

    public String getPrinterSerialNo() throws RemoteException;

    public String getPrinterVersion() throws RemoteException;

    public String getPrinterModal() throws RemoteException;

    public void getPrintedLength(InnerResultCallback callback) throws RemoteException;

    public void lineWrap(int n, InnerResultCallback callback) throws RemoteException;

    public void sendRAWData(byte[] data, InnerResultCallback callback) throws RemoteException;

    public void setAlignment(int alignment, InnerResultCallback callback) throws RemoteException;

    public void setFontName(String typeface, InnerResultCallback callback) throws RemoteException;

    public void setFontSize(float fontsize, InnerResultCallback callback) throws RemoteException;

    public void printText(String text, InnerResultCallback callback) throws RemoteException;

    public void printTextWithFont(String text, String typeface, float fontsize, InnerResultCallback callback) throws RemoteException;

    public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, InnerResultCallback callback) throws RemoteException;

    public void printBitmap(android.graphics.Bitmap bitmap, InnerResultCallback callback) throws RemoteException;

    public void printBarCode(String data, int symbology, int height, int width, int textposition, InnerResultCallback callback) throws RemoteException;

    public void printQRCode(String data, int modulesize, int errorlevel, InnerResultCallback callback) throws RemoteException;

    public void printOriginalText(String text, InnerResultCallback callback) throws RemoteException;

    public void commitPrint(TransBean[] transbean, InnerResultCallback callback) throws RemoteException;

    public void commitPrinterBuffer() throws RemoteException;

    public void cutPaper(InnerResultCallback callback) throws RemoteException;

    public int getCutPaperTimes() throws RemoteException;

    public void openDrawer(InnerResultCallback callback) throws RemoteException;

    public int getOpenDrawerTimes() throws RemoteException;

    public void enterPrinterBuffer(boolean clean) throws RemoteException;

    public void exitPrinterBuffer(boolean commit) throws RemoteException;

    public void tax(byte[] data, InnerTaxCallback callback) throws RemoteException;

    public void getPrinterFactory(InnerResultCallback callback) throws RemoteException;

    public void clearBuffer() throws RemoteException;

    public void commitPrinterBufferWithCallback(InnerResultCallback callback) throws RemoteException;

    public void exitPrinterBufferWithCallback(boolean commit, InnerResultCallback callback) throws RemoteException;

    public void printColumnsString(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, InnerResultCallback callback) throws RemoteException;

    public int updatePrinterState() throws RemoteException;

    public void sendLCDCommand(int flag) throws RemoteException;

    public void sendLCDString(String string, InnerLcdCallback callback) throws RemoteException;

    public void sendLCDBitmap(android.graphics.Bitmap bitmap, InnerLcdCallback callback) throws RemoteException;

    public int getPrinterMode() throws RemoteException;

    public int getPrinterBBMDistance() throws RemoteException;

    public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, InnerResultCallback callback) throws RemoteException;

    public int getForcedDouble() throws RemoteException;

    public boolean isForcedAntiWhite() throws RemoteException;

    public boolean isForcedBold() throws RemoteException;

    public boolean isForcedUnderline() throws RemoteException;

    public int getForcedRowHeight() throws RemoteException;

    public int getFontName() throws RemoteException;

    public void sendLCDDoubleString(String topText, String bottomText, InnerLcdCallback callback) throws RemoteException;

    public int getPrinterPaper() throws RemoteException;

    public boolean getDrawerStatus() throws RemoteException;

    public void sendLCDFillString(String string, int size, boolean fill, InnerLcdCallback callback) throws RemoteException;

    public void sendLCDMultiString(String[] text, int[] align, InnerLcdCallback callback) throws RemoteException;

    public int getPrinterDensity() throws RemoteException;

    public void print2DCode(String data, int symbology, int modulesize, int errorlevel, InnerResultCallback callback) throws RemoteException;

    public void autoOutPaper(InnerResultCallback callback) throws RemoteException;

    public void setPrinterStyle(int key, int value) throws RemoteException;

    public void labelLocate() throws RemoteException;

    public void labelOutput() throws RemoteException;
}

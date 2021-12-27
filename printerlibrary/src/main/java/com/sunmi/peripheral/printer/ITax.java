/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.peripheral.printer;
/**
 * 打印服务执行结果的回调
 */
public interface ITax extends android.os.IInterface
{
  /** Default implementation for ITax. */
  public static class Default implements ITax
  {
    @Override public void onDataResult(byte[] data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements ITax
  {
    private static final String DESCRIPTOR = "com.sunmi.peripheral.printer.ITax";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.peripheral.printer.ITax interface,
     * generating a proxy if needed.
     */
    public static ITax asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof ITax))) {
        return ((ITax)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onDataResult:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.onDataResult(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements ITax
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onDataResult(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDataResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onDataResult(data);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static ITax sDefaultImpl;
    }
    static final int TRANSACTION_onDataResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(ITax impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static ITax getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public void onDataResult(byte[] data) throws android.os.RemoteException;
}

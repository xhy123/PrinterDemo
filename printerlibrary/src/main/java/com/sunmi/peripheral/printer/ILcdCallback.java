/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.peripheral.printer;
/**
 * 顾显反馈结果
 */
public interface ILcdCallback extends android.os.IInterface
{
  /** Default implementation for ILcdCallback. */
  public static class Default implements ILcdCallback
  {
    /**
    	* 返回执行结果
    	* @param show:		  true 显示成功  false 显示失败
    	*/
    @Override public void onRunResult(boolean show) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements ILcdCallback
  {
    private static final String DESCRIPTOR = "com.sunmi.peripheral.printer.ILcdCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.peripheral.printer.ILcdCallback interface,
     * generating a proxy if needed.
     */
    public static ILcdCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof ILcdCallback))) {
        return ((ILcdCallback)iin);
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
        case TRANSACTION_onRunResult:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onRunResult(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements ILcdCallback
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
      /**
      	* 返回执行结果
      	* @param show:		  true 显示成功  false 显示失败
      	*/
      @Override public void onRunResult(boolean show) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((show)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRunResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRunResult(show);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static ILcdCallback sDefaultImpl;
    }
    static final int TRANSACTION_onRunResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(ILcdCallback impl) {
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
    public static ILcdCallback getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  /**
  	* 返回执行结果
  	* @param show:		  true 显示成功  false 显示失败
  	*/
  public void onRunResult(boolean show) throws android.os.RemoteException;
}

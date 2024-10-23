/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.imin.printer;
public interface ILabelPrintResult extends android.os.IInterface
{
  /** Default implementation for ILabelPrintResult. */
  public static class Default implements com.imin.printer.ILabelPrintResult
  {
    /**
        * 返回接口执行的结果
        * @param resultCode:	打印成功返回0  打印失败返回 <0
        * @param message:	失败时附加信息
        */
    @Override public void onResult(int resultCode, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.imin.printer.ILabelPrintResult
  {
    private static final java.lang.String DESCRIPTOR = "com.imin.printer.ILabelPrintResult";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.imin.printer.ILabelPrintResult interface,
     * generating a proxy if needed.
     */
    public static com.imin.printer.ILabelPrintResult asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.imin.printer.ILabelPrintResult))) {
        return ((com.imin.printer.ILabelPrintResult)iin);
      }
      return new com.imin.printer.ILabelPrintResult.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onResult:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onResult(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.imin.printer.ILabelPrintResult
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
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
          * 返回接口执行的结果
          * @param resultCode:	打印成功返回0  打印失败返回 <0
          * @param message:	失败时附加信息
          */
      @Override public void onResult(int resultCode, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(resultCode);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onResult(resultCode, message);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.imin.printer.ILabelPrintResult sDefaultImpl;
    }
    static final int TRANSACTION_onResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.imin.printer.ILabelPrintResult impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.imin.printer.ILabelPrintResult getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
      * 返回接口执行的结果
      * @param resultCode:	打印成功返回0  打印失败返回 <0
      * @param message:	失败时附加信息
      */
  public void onResult(int resultCode, java.lang.String message) throws android.os.RemoteException;
}

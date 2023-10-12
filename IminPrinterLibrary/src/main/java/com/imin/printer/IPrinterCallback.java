/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.imin.printer;
public interface IPrinterCallback extends android.os.IInterface
{
  /** Default implementation for IPrinterCallback. */
  public static class Default implements com.imin.printer.IPrinterCallback
  {
    /**
       	* 返回接口执行的结果
       	* 备注：此回调只表明接口执行是否成功但不表明打印机的工作结果，如需要获取打印机结果请用事务模式
       	* @param isSuccess:	  true执行成功，false 执行失败
       	*/
    @Override public void onRunResult(boolean isSuccess) throws android.os.RemoteException
    {
    }
    /**
       	* 返回接口执行的结果(字符串数据)
       	* @param result:	结果，打印机上电以来打印长度等(单位mm)
       	*/
    @Override public void onReturnString(java.lang.String result) throws android.os.RemoteException
    {
    }
    /**
       	* 返回接口执行失败时发生异常情况的具体原因
       	* code：	异常代码
       	* msg:	异常描述
       	*/
    @Override public void onRaiseException(int code, java.lang.String msg) throws android.os.RemoteException
    {
    }
    /**
       	* 返回打印机结果
       	* code：	异常代码 0 成功 1 失败
       	* msg:	异常描述
       	*/
    @Override public void onPrintResult(int code, java.lang.String msg) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.imin.printer.IPrinterCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.imin.printer.IPrinterCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.imin.printer.IPrinterCallback interface,
     * generating a proxy if needed.
     */
    public static com.imin.printer.IPrinterCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.imin.printer.IPrinterCallback))) {
        return ((com.imin.printer.IPrinterCallback)iin);
      }
      return new com.imin.printer.IPrinterCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onRunResult:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onRunResult(_arg0);
          return true;
        }
        case TRANSACTION_onReturnString:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onReturnString(_arg0);
          return true;
        }
        case TRANSACTION_onRaiseException:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onRaiseException(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onPrintResult:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onPrintResult(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.imin.printer.IPrinterCallback
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
         	* 备注：此回调只表明接口执行是否成功但不表明打印机的工作结果，如需要获取打印机结果请用事务模式
         	* @param isSuccess:	  true执行成功，false 执行失败
         	*/
      @Override public void onRunResult(boolean isSuccess) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isSuccess)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRunResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRunResult(isSuccess);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
         	* 返回接口执行的结果(字符串数据)
         	* @param result:	结果，打印机上电以来打印长度等(单位mm)
         	*/
      @Override public void onReturnString(java.lang.String result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(result);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onReturnString, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onReturnString(result);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
         	* 返回接口执行失败时发生异常情况的具体原因
         	* code：	异常代码
         	* msg:	异常描述
         	*/
      @Override public void onRaiseException(int code, java.lang.String msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          _data.writeString(msg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRaiseException, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRaiseException(code, msg);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
         	* 返回打印机结果
         	* code：	异常代码 0 成功 1 失败
         	* msg:	异常描述
         	*/
      @Override public void onPrintResult(int code, java.lang.String msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          _data.writeString(msg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPrintResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPrintResult(code, msg);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.imin.printer.IPrinterCallback sDefaultImpl;
    }
    static final int TRANSACTION_onRunResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onReturnString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onRaiseException = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onPrintResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(com.imin.printer.IPrinterCallback impl) {
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
    public static com.imin.printer.IPrinterCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
     	* 返回接口执行的结果
     	* 备注：此回调只表明接口执行是否成功但不表明打印机的工作结果，如需要获取打印机结果请用事务模式
     	* @param isSuccess:	  true执行成功，false 执行失败
     	*/
  public void onRunResult(boolean isSuccess) throws android.os.RemoteException;
  /**
     	* 返回接口执行的结果(字符串数据)
     	* @param result:	结果，打印机上电以来打印长度等(单位mm)
     	*/
  public void onReturnString(java.lang.String result) throws android.os.RemoteException;
  /**
     	* 返回接口执行失败时发生异常情况的具体原因
     	* code：	异常代码
     	* msg:	异常描述
     	*/
  public void onRaiseException(int code, java.lang.String msg) throws android.os.RemoteException;
  /**
     	* 返回打印机结果
     	* code：	异常代码 0 成功 1 失败
     	* msg:	异常描述
     	*/
  public void onPrintResult(int code, java.lang.String msg) throws android.os.RemoteException;
}

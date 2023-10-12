/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.imin.printer;
public interface IPrinterUpdateCallback extends android.os.IInterface
{
  /** Default implementation for IPrinterUpdateCallback. */
  public static class Default implements com.imin.printer.IPrinterUpdateCallback
  {
    /**
         *
         * @param status
         * -1  Get firware version fail.                                                         msg.what = 1
         * 1  The firmware version does not match the printer...                                 msg.what = 10
         * 3  更新固件的进度 （设置默认值，最大的值）                                                  msg.what = 101
         * 4  Updatefirware begin                                                                msg.what = 3
         * 5  Read update file......                                                             msg.what = 3
         * 6  Initialization printer                                                             msg.what = 3
         * 7  Rest printer                                                                       msg.what = 3
         * 8  Printer Rest success.                                                              msg.what = 3
         * 9  Printer communication failure.                                                     msg.what = 10
         * 10  Wait for printer response.                                                        msg.what = 3
         * 11  BIN files and printers do not match.                                                     msg.what = 3
         * 12  Updatefirware please wait                                                     msg.what = 3
         * 13  ...                                                                                msg.what = 4
         * 14  更新下载进度                                                     msg.what = 102
         * 15  updaet check error.                                                     msg.what = 3
         * 16  update check fail.                                                     msg.what = 3
         * 17  Check ok.                                                     msg.what = 3
         * 18  Check error.                                                     msg.what = 3
         * 19  Check fail.                                                     msg.what = 3
         * 20                                                       msg.what = 10
         * 21   Updatefirware fail.                                     msg.what = 10
         * 22   Rest Printer.                                     msg.what = 3
         * 23   The program update is complete, Rest Printer fail!                                 msg.what = 3
         * 24   The program update is complete, please restart the printer!                        msg.what = 10
         *
         * 110   升级失败  进行重连USB
         * 111    开启升级弹框
         * 112     进度最大值
         * 113    打印机固件更新进度
         *
         * 115  升级成功
         * @param message
         */
    @Override public void printerUpdateStatus(int status, int arg, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override public void error(java.lang.String msg) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.imin.printer.IPrinterUpdateCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.imin.printer.IPrinterUpdateCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.imin.printer.IPrinterUpdateCallback interface,
     * generating a proxy if needed.
     */
    public static com.imin.printer.IPrinterUpdateCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.imin.printer.IPrinterUpdateCallback))) {
        return ((com.imin.printer.IPrinterUpdateCallback)iin);
      }
      return new com.imin.printer.IPrinterUpdateCallback.Stub.Proxy(obj);
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
        case TRANSACTION_printerUpdateStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.printerUpdateStatus(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_error:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.error(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.imin.printer.IPrinterUpdateCallback
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
           *
           * @param status
           * -1  Get firware version fail.                                                         msg.what = 1
           * 1  The firmware version does not match the printer...                                 msg.what = 10
           * 3  更新固件的进度 （设置默认值，最大的值）                                                  msg.what = 101
           * 4  Updatefirware begin                                                                msg.what = 3
           * 5  Read update file......                                                             msg.what = 3
           * 6  Initialization printer                                                             msg.what = 3
           * 7  Rest printer                                                                       msg.what = 3
           * 8  Printer Rest success.                                                              msg.what = 3
           * 9  Printer communication failure.                                                     msg.what = 10
           * 10  Wait for printer response.                                                        msg.what = 3
           * 11  BIN files and printers do not match.                                                     msg.what = 3
           * 12  Updatefirware please wait                                                     msg.what = 3
           * 13  ...                                                                                msg.what = 4
           * 14  更新下载进度                                                     msg.what = 102
           * 15  updaet check error.                                                     msg.what = 3
           * 16  update check fail.                                                     msg.what = 3
           * 17  Check ok.                                                     msg.what = 3
           * 18  Check error.                                                     msg.what = 3
           * 19  Check fail.                                                     msg.what = 3
           * 20                                                       msg.what = 10
           * 21   Updatefirware fail.                                     msg.what = 10
           * 22   Rest Printer.                                     msg.what = 3
           * 23   The program update is complete, Rest Printer fail!                                 msg.what = 3
           * 24   The program update is complete, please restart the printer!                        msg.what = 10
           *
           * 110   升级失败  进行重连USB
           * 111    开启升级弹框
           * 112     进度最大值
           * 113    打印机固件更新进度
           *
           * 115  升级成功
           * @param message
           */
      @Override public void printerUpdateStatus(int status, int arg, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          _data.writeInt(arg);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printerUpdateStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printerUpdateStatus(status, arg, message);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void error(java.lang.String msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(msg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_error, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().error(msg);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.imin.printer.IPrinterUpdateCallback sDefaultImpl;
    }
    static final int TRANSACTION_printerUpdateStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_error = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(com.imin.printer.IPrinterUpdateCallback impl) {
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
    public static com.imin.printer.IPrinterUpdateCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       *
       * @param status
       * -1  Get firware version fail.                                                         msg.what = 1
       * 1  The firmware version does not match the printer...                                 msg.what = 10
       * 3  更新固件的进度 （设置默认值，最大的值）                                                  msg.what = 101
       * 4  Updatefirware begin                                                                msg.what = 3
       * 5  Read update file......                                                             msg.what = 3
       * 6  Initialization printer                                                             msg.what = 3
       * 7  Rest printer                                                                       msg.what = 3
       * 8  Printer Rest success.                                                              msg.what = 3
       * 9  Printer communication failure.                                                     msg.what = 10
       * 10  Wait for printer response.                                                        msg.what = 3
       * 11  BIN files and printers do not match.                                                     msg.what = 3
       * 12  Updatefirware please wait                                                     msg.what = 3
       * 13  ...                                                                                msg.what = 4
       * 14  更新下载进度                                                     msg.what = 102
       * 15  updaet check error.                                                     msg.what = 3
       * 16  update check fail.                                                     msg.what = 3
       * 17  Check ok.                                                     msg.what = 3
       * 18  Check error.                                                     msg.what = 3
       * 19  Check fail.                                                     msg.what = 3
       * 20                                                       msg.what = 10
       * 21   Updatefirware fail.                                     msg.what = 10
       * 22   Rest Printer.                                     msg.what = 3
       * 23   The program update is complete, Rest Printer fail!                                 msg.what = 3
       * 24   The program update is complete, please restart the printer!                        msg.what = 10
       *
       * 110   升级失败  进行重连USB
       * 111    开启升级弹框
       * 112     进度最大值
       * 113    打印机固件更新进度
       *
       * 115  升级成功
       * @param message
       */
  public void printerUpdateStatus(int status, int arg, java.lang.String message) throws android.os.RemoteException;
  public void error(java.lang.String msg) throws android.os.RemoteException;
}

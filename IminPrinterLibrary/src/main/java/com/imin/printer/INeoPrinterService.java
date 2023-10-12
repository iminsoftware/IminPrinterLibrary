/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.imin.printer;
public interface INeoPrinterService extends android.os.IInterface
{
  /** Default implementation for INeoPrinterService. */
  public static class Default implements com.imin.printer.INeoPrinterService
  {
    @Override public int initPrinter(java.lang.String packageName, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void initPrinterParams(int fd) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterSerialNumber(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterModelName(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterThermalHead(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterFirmwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getServiceVersion(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getPrinterStatus(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.lang.String getUsbPrinterVidPid(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getUsbDevicesName(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setPrinterDensity(int fd, int density) throws android.os.RemoteException
    {
    }
    @Override public int getPrinterDensity(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setPrinterSpeed(int fd, int speed) throws android.os.RemoteException
    {
    }
    @Override public int getPrinterSpeed(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void getPrinterPaperDistance(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterCutTimes(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setPageFormat(int fd, int format) throws android.os.RemoteException
    {
    }
    @Override public int getPrinterMode(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setPrinterMode(int fd, int mode) throws android.os.RemoteException
    {
    }
    @Override public int getPrinterPaperType(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void openDrawer(int fd) throws android.os.RemoteException
    {
    }
    @Override public boolean getDrawerStatus(int fd) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int getOpenDrawerTimes(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void printerSelfChecking(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void sendRAWData(int fd, byte[] bytes, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void enterPrinterBuffer(int fd, boolean clean) throws android.os.RemoteException
    {
    }
    @Override public void commitPrinterBuffer(int fd) throws android.os.RemoteException
    {
    }
    @Override public void commitPrinterBufferWithCallback(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void exitPrinterBuffer(int fd, boolean commit) throws android.os.RemoteException
    {
    }
    @Override public void exitPrinterBufferWithCallback(int fd, boolean commit, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setDebugLogLevel(int fd, int level) throws android.os.RemoteException
    {
    }
    @Override public void setDebugLogSize(int fd, int size) throws android.os.RemoteException
    {
    }
    @Override public void setDebugLogModule(int fd, java.lang.String module, boolean isOpen) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getDebugLogState(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void printAndLineFeed(int fd) throws android.os.RemoteException
    {
    }
    @Override public void printAndFeedPaper(int fd, int value) throws android.os.RemoteException
    {
    }
    @Override public void printAndQuitPaper(int fd, int value) throws android.os.RemoteException
    {
    }
    @Override public void partialCut(int fd) throws android.os.RemoteException
    {
    }
    @Override public void fullCut(int fd) throws android.os.RemoteException
    {
    }
    @Override public void setFontMultiple(int fd, int wide, int high) throws android.os.RemoteException
    {
    }
    @Override public void setFontBold(int fd, boolean bold) throws android.os.RemoteException
    {
    }
    @Override public void setFontAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException
    {
    }
    @Override public void setFontItalic(int fd, boolean italic) throws android.os.RemoteException
    {
    }
    @Override public void setFontUnderline(int fd, int underline) throws android.os.RemoteException
    {
    }
    @Override public void setFontRotate(int fd, int rotate) throws android.os.RemoteException
    {
    }
    @Override public void setFontDirection(int fd, int direction) throws android.os.RemoteException
    {
    }
    @Override public void setFontLineSpacing(int fd, int space) throws android.os.RemoteException
    {
    }
    @Override public void setFontChineseSpace(int fd, int chsLeftSpace, int chsRightSpace) throws android.os.RemoteException
    {
    }
    @Override public void setFontCharSpace(int fd, int space) throws android.os.RemoteException
    {
    }
    @Override public void setFontChineseSize(int fd, int height, int width, int underLine, int chineseType) throws android.os.RemoteException
    {
    }
    @Override public void setFontCharSize(int fd, int height, int width, int underLine, int asciitype) throws android.os.RemoteException
    {
    }
    @Override public void setFontChineseMode(int fd, int mode) throws android.os.RemoteException
    {
    }
    @Override public void setFontCountryCode(int fd, int country) throws android.os.RemoteException
    {
    }
    @Override public void setFontCodepage(int fd, int codepage) throws android.os.RemoteException
    {
    }
    @Override public java.util.List<java.lang.String> getFontCountryCode(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> getFontCodepage(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void printText(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printTextWithAli(int fd, java.lang.String text, int anInt, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printTextWithEncode(int fd, java.lang.String text, java.lang.String code, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setCodeAlignment(int fd, int alignmentMode) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapTypeface(int fd, java.lang.String typeface) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapSize(int fd, int size) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapStyle(int fd, int style) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapStrikeThru(int fd, boolean strikeThru) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapUnderline(int fd, boolean haveUnderline) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapLineSpacing(int fd, float space) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapLetterSpacing(int fd, float space) throws android.os.RemoteException
    {
    }
    @Override public void setTextBitmapAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException
    {
    }
    @Override public void printTextBitmap(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printTextBitmapWithAli(int fd, java.lang.String text, int align, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printBitmap(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printBitmapWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printMultiBitmap(int fd, java.util.List<android.graphics.Bitmap> bitmaps, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printMultiBitmapWithAlign(int fd, java.util.List<android.graphics.Bitmap> bitmaps, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printColumnsText(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printColumnsString(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setBarCodeWidth(int fd, int width) throws android.os.RemoteException
    {
    }
    @Override public void setBarCodeHeight(int fd, int height) throws android.os.RemoteException
    {
    }
    @Override public void setBarCodeContentPrintPos(int fd, int pos) throws android.os.RemoteException
    {
    }
    @Override public void printBarCodeWithFull(int fd, java.lang.String data, int barCodeType, int width, int height, int textposition, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printBarCode(int fd, java.lang.String data, int barCodeType, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printBarCodeWithAlign(int fd, java.lang.String data, int barCodeType, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setQrCodeSize(int fd, int size) throws android.os.RemoteException
    {
    }
    @Override public void setQrCodeErrorCorrectionLev(int fd, int level) throws android.os.RemoteException
    {
    }
    @Override public void setLeftMargin(int fd, int valve) throws android.os.RemoteException
    {
    }
    @Override public void printQRCodeWithFull(int fd, java.lang.String data, int size, int errorlevel, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printQrCode(int fd, java.lang.String data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printQrCodeWithAlign(int fd, java.lang.String data, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQRSize(int fd, int size) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR1MarginLeft(int fd, int qr1Left) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR2MarginLeft(int fd, int qr2Left) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR1Level(int fd, int qr1Level) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR2Level(int fd, int qr2Level) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR1Version(int fd, int qr1Version) throws android.os.RemoteException
    {
    }
    @Override public void setDoubleQR2Version(int fd, int qr2Version) throws android.os.RemoteException
    {
    }
    @Override public void printDoubleQR(int fd, java.lang.String qr1Data, java.lang.String qr2Data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getPrinterUpdatePath(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setPrinterUpdatePath(int fd, java.lang.String path) throws android.os.RemoteException
    {
    }
    @Override public void startPrinterUpdate(int fd) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterUpdateStatus(int fd, com.imin.printer.IPrinterUpdateCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setIsUpdatePrinter(int fd, int update) throws android.os.RemoteException
    {
    }
    @Override public void printBitmapColorChart(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void printBitmapColorChartWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterHardwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public int getPrinterIsUpdateStatus(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void updatePrinterInfo(int fd) throws android.os.RemoteException
    {
    }
    @Override public void setIsReconnectUsb(int fd, int isConnect) throws android.os.RemoteException
    {
    }
    @Override public int getIsReconnectUsb(int fd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void getConfigurationInfo(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterKnifeReset(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void getPrinterTemperature(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void setConnectInternalPrinter(int fd, boolean connect) throws android.os.RemoteException
    {
    }
    @Override public boolean getConnectInternalPrinter(int fd) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void checkUpdateFirmware(int fd) throws android.os.RemoteException
    {
    }
    @Override public java.util.List<java.lang.String> getPrinterDensityList(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> getPrinterSpeedList(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> getPrinterPaperTypeList(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> getPrinterPatternList(int fd) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean supportCashBox(int fd) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.imin.printer.INeoPrinterService
  {
    private static final java.lang.String DESCRIPTOR = "com.imin.printer.INeoPrinterService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.imin.printer.INeoPrinterService interface,
     * generating a proxy if needed.
     */
    public static com.imin.printer.INeoPrinterService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.imin.printer.INeoPrinterService))) {
        return ((com.imin.printer.INeoPrinterService)iin);
      }
      return new com.imin.printer.INeoPrinterService.Stub.Proxy(obj);
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
        case TRANSACTION_initPrinter:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          int _result = this.initPrinter(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_initPrinterParams:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.initPrinterParams(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterSerialNumber:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterSerialNumber(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterModelName:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterModelName(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterThermalHead:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterThermalHead(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterFirmwareVersion:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterFirmwareVersion(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getServiceVersion:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getServiceVersion(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPrinterStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getPrinterStatus(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getUsbPrinterVidPid:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getUsbPrinterVidPid(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getUsbDevicesName:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getUsbDevicesName(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setPrinterDensity:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setPrinterDensity(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterDensity:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getPrinterDensity(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPrinterSpeed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setPrinterSpeed(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterSpeed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getPrinterSpeed(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterPaperDistance:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterPaperDistance(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterCutTimes:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterCutTimes(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPageFormat:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setPageFormat(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getPrinterMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPrinterMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setPrinterMode(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterPaperType:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getPrinterPaperType(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_openDrawer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.openDrawer(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getDrawerStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.getDrawerStatus(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getOpenDrawerTimes:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getOpenDrawerTimes(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printerSelfChecking:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printerSelfChecking(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sendRAWData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.sendRAWData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enterPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.enterPrinterBuffer(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_commitPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.commitPrinterBuffer(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_commitPrinterBufferWithCallback:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.commitPrinterBufferWithCallback(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_exitPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.exitPrinterBuffer(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_exitPrinterBufferWithCallback:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.exitPrinterBufferWithCallback(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDebugLogLevel:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDebugLogLevel(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDebugLogSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDebugLogSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDebugLogModule:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          this.setDebugLogModule(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getDebugLogState:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getDebugLogState(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_printAndLineFeed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.printAndLineFeed(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printAndFeedPaper:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.printAndFeedPaper(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printAndQuitPaper:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.printAndQuitPaper(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_partialCut:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.partialCut(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_fullCut:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.fullCut(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontMultiple:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.setFontMultiple(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontBold:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setFontBold(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontAntiWhite:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setFontAntiWhite(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontItalic:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setFontItalic(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontUnderline:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontUnderline(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontRotate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontRotate(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontDirection:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontDirection(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontLineSpacing:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontLineSpacing(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontChineseSpace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.setFontChineseSpace(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontCharSpace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontCharSpace(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontChineseSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          this.setFontChineseSize(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontCharSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          this.setFontCharSize(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontChineseMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontChineseMode(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontCountryCode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontCountryCode(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontCodepage:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setFontCodepage(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getFontCountryCode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getFontCountryCode(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_getFontCodepage:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getFontCodepage(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_printText:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printText(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printTextWithAli:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printTextWithAli(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printTextWithEncode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printTextWithEncode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setCodeAlignment:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setCodeAlignment(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapTypeface:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.setTextBitmapTypeface(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setTextBitmapSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapStyle:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setTextBitmapStyle(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapStrikeThru:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setTextBitmapStrikeThru(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapUnderline:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setTextBitmapUnderline(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapLineSpacing:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          float _arg1;
          _arg1 = data.readFloat();
          this.setTextBitmapLineSpacing(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapLetterSpacing:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          float _arg1;
          _arg1 = data.readFloat();
          this.setTextBitmapLetterSpacing(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setTextBitmapAntiWhite:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setTextBitmapAntiWhite(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printTextBitmap:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printTextBitmap(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printTextBitmapWithAli:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printTextBitmapWithAli(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBitmap:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.graphics.Bitmap _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmap(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBitmapWithAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.graphics.Bitmap _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmapWithAlign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printMultiBitmap:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<android.graphics.Bitmap> _arg1;
          _arg1 = data.createTypedArrayList(android.graphics.Bitmap.CREATOR);
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printMultiBitmap(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printMultiBitmapWithAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<android.graphics.Bitmap> _arg1;
          _arg1 = data.createTypedArrayList(android.graphics.Bitmap.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printMultiBitmapWithAlign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printColumnsText:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          int[] _arg3;
          _arg3 = data.createIntArray();
          int[] _arg4;
          _arg4 = data.createIntArray();
          com.imin.printer.IPrinterCallback _arg5;
          _arg5 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printColumnsText(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printColumnsString:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          int[] _arg3;
          _arg3 = data.createIntArray();
          int[] _arg4;
          _arg4 = data.createIntArray();
          com.imin.printer.IPrinterCallback _arg5;
          _arg5 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printColumnsString(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setBarCodeWidth:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setBarCodeWidth(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setBarCodeHeight:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setBarCodeHeight(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setBarCodeContentPrintPos:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setBarCodeContentPrintPos(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBarCodeWithFull:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          com.imin.printer.IPrinterCallback _arg7;
          _arg7 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBarCodeWithFull(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBarCode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBarCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBarCodeWithAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          com.imin.printer.IPrinterCallback _arg4;
          _arg4 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBarCodeWithAlign(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setQrCodeSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setQrCodeSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setQrCodeErrorCorrectionLev:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setQrCodeErrorCorrectionLev(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setLeftMargin:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setLeftMargin(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printQRCodeWithFull:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          com.imin.printer.IPrinterCallback _arg5;
          _arg5 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printQRCodeWithFull(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printQrCode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printQrCode(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printQrCodeWithAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printQrCodeWithAlign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQRSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQRSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR1MarginLeft:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR1MarginLeft(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR2MarginLeft:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR2MarginLeft(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR1Level:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR1Level(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR2Level:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR2Level(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR1Version:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR1Version(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDoubleQR2Version:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setDoubleQR2Version(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printDoubleQR:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printDoubleQR(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterUpdatePath:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getPrinterUpdatePath(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setPrinterUpdatePath:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.setPrinterUpdatePath(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_startPrinterUpdate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.startPrinterUpdate(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterUpdateStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterUpdateCallback _arg1;
          _arg1 = com.imin.printer.IPrinterUpdateCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterUpdateStatus(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setIsUpdatePrinter:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setIsUpdatePrinter(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBitmapColorChart:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.graphics.Bitmap _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          com.imin.printer.IPrinterCallback _arg2;
          _arg2 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmapColorChart(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBitmapColorChartWithAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.graphics.Bitmap _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _arg2;
          _arg2 = data.readInt();
          com.imin.printer.IPrinterCallback _arg3;
          _arg3 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmapColorChartWithAlign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterHardwareVersion:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterHardwareVersion(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterIsUpdateStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          int _result = this.getPrinterIsUpdateStatus(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_updatePrinterInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.updatePrinterInfo(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setIsReconnectUsb:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setIsReconnectUsb(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getIsReconnectUsb:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getIsReconnectUsb(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getConfigurationInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getConfigurationInfo(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterKnifeReset:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterKnifeReset(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterTemperature:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.imin.printer.IPrinterCallback _arg1;
          _arg1 = com.imin.printer.IPrinterCallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterTemperature(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setConnectInternalPrinter:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setConnectInternalPrinter(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getConnectInternalPrinter:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.getConnectInternalPrinter(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_checkUpdateFirmware:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.checkUpdateFirmware(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterDensityList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getPrinterDensityList(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_getPrinterSpeedList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getPrinterSpeedList(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_getPrinterPaperTypeList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getPrinterPaperTypeList(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_getPrinterPatternList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getPrinterPatternList(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_supportCashBox:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.supportCashBox(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.imin.printer.INeoPrinterService
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
      @Override public int initPrinter(java.lang.String packageName, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPrinter, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initPrinter(packageName, callback);
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
      @Override public void initPrinterParams(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPrinterParams, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().initPrinterParams(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterSerialNumber(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterSerialNumber, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterSerialNumber(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterModelName(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterModelName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterModelName(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterThermalHead(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterThermalHead, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterThermalHead(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterFirmwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterFirmwareVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterFirmwareVersion(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getServiceVersion(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getServiceVersion(fd);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getPrinterStatus(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterStatus(fd);
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
      @Override public java.lang.String getUsbPrinterVidPid(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsbPrinterVidPid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUsbPrinterVidPid(fd);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getUsbDevicesName(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsbDevicesName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUsbDevicesName(fd);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setPrinterDensity(int fd, int density) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(density);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrinterDensity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPrinterDensity(fd, density);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPrinterDensity(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterDensity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterDensity(fd);
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
      @Override public void setPrinterSpeed(int fd, int speed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(speed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrinterSpeed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPrinterSpeed(fd, speed);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPrinterSpeed(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterSpeed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterSpeed(fd);
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
      @Override public void getPrinterPaperDistance(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterPaperDistance, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterPaperDistance(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterCutTimes(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterCutTimes, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterCutTimes(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setPageFormat(int fd, int format) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(format);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPageFormat, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPageFormat(fd, format);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPrinterMode(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterMode(fd);
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
      @Override public void setPrinterMode(int fd, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrinterMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPrinterMode(fd, mode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPrinterPaperType(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterPaperType, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterPaperType(fd);
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
      @Override public void openDrawer(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openDrawer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().openDrawer(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean getDrawerStatus(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDrawerStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDrawerStatus(fd);
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
      @Override public int getOpenDrawerTimes(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOpenDrawerTimes, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getOpenDrawerTimes(fd);
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
      @Override public void printerSelfChecking(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printerSelfChecking(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void sendRAWData(int fd, byte[] bytes, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeByteArray(bytes);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendRAWData(fd, bytes, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void enterPrinterBuffer(int fd, boolean clean) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((clean)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enterPrinterBuffer(fd, clean);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void commitPrinterBuffer(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commitPrinterBuffer(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void commitPrinterBufferWithCallback(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitPrinterBufferWithCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commitPrinterBufferWithCallback(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void exitPrinterBuffer(int fd, boolean commit) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((commit)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().exitPrinterBuffer(fd, commit);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void exitPrinterBufferWithCallback(int fd, boolean commit, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((commit)?(1):(0)));
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitPrinterBufferWithCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().exitPrinterBufferWithCallback(fd, commit, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDebugLogLevel(int fd, int level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDebugLogLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDebugLogLevel(fd, level);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDebugLogSize(int fd, int size) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(size);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDebugLogSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDebugLogSize(fd, size);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDebugLogModule(int fd, java.lang.String module, boolean isOpen) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(module);
          _data.writeInt(((isOpen)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDebugLogModule, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDebugLogModule(fd, module, isOpen);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getDebugLogState(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDebugLogState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDebugLogState(fd);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void printAndLineFeed(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printAndLineFeed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printAndLineFeed(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printAndFeedPaper(int fd, int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printAndFeedPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printAndFeedPaper(fd, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printAndQuitPaper(int fd, int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printAndQuitPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printAndQuitPaper(fd, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void partialCut(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_partialCut, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().partialCut(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fullCut(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fullCut, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().fullCut(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontMultiple(int fd, int wide, int high) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(wide);
          _data.writeInt(high);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontMultiple, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontMultiple(fd, wide, high);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontBold(int fd, boolean bold) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((bold)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontBold, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontBold(fd, bold);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((antiWhite)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontAntiWhite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontAntiWhite(fd, antiWhite);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontItalic(int fd, boolean italic) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((italic)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontItalic, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontItalic(fd, italic);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontUnderline(int fd, int underline) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(underline);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontUnderline, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontUnderline(fd, underline);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontRotate(int fd, int rotate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(rotate);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontRotate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontRotate(fd, rotate);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontDirection(int fd, int direction) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(direction);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontDirection, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontDirection(fd, direction);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontLineSpacing(int fd, int space) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(space);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontLineSpacing, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontLineSpacing(fd, space);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontChineseSpace(int fd, int chsLeftSpace, int chsRightSpace) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(chsLeftSpace);
          _data.writeInt(chsRightSpace);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontChineseSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontChineseSpace(fd, chsLeftSpace, chsRightSpace);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontCharSpace(int fd, int space) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(space);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontCharSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontCharSpace(fd, space);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontChineseSize(int fd, int height, int width, int underLine, int chineseType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(height);
          _data.writeInt(width);
          _data.writeInt(underLine);
          _data.writeInt(chineseType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontChineseSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontChineseSize(fd, height, width, underLine, chineseType);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontCharSize(int fd, int height, int width, int underLine, int asciitype) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(height);
          _data.writeInt(width);
          _data.writeInt(underLine);
          _data.writeInt(asciitype);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontCharSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontCharSize(fd, height, width, underLine, asciitype);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontChineseMode(int fd, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontChineseMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontChineseMode(fd, mode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontCountryCode(int fd, int country) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(country);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontCountryCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontCountryCode(fd, country);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFontCodepage(int fd, int codepage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(codepage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontCodepage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontCodepage(fd, codepage);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.util.List<java.lang.String> getFontCountryCode(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFontCountryCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getFontCountryCode(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> getFontCodepage(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFontCodepage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getFontCodepage(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void printText(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(text);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printText(fd, text, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printTextWithAli(int fd, java.lang.String text, int anInt, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(text);
          _data.writeInt(anInt);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTextWithAli, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printTextWithAli(fd, text, anInt, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printTextWithEncode(int fd, java.lang.String text, java.lang.String code, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(text);
          _data.writeString(code);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTextWithEncode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printTextWithEncode(fd, text, code, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setCodeAlignment(int fd, int alignmentMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(alignmentMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCodeAlignment, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setCodeAlignment(fd, alignmentMode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapTypeface(int fd, java.lang.String typeface) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(typeface);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapTypeface, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapTypeface(fd, typeface);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapSize(int fd, int size) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(size);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapSize(fd, size);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapStyle(int fd, int style) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(style);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapStyle, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapStyle(fd, style);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapStrikeThru(int fd, boolean strikeThru) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((strikeThru)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapStrikeThru, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapStrikeThru(fd, strikeThru);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapUnderline(int fd, boolean haveUnderline) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((haveUnderline)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapUnderline, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapUnderline(fd, haveUnderline);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapLineSpacing(int fd, float space) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeFloat(space);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapLineSpacing, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapLineSpacing(fd, space);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapLetterSpacing(int fd, float space) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeFloat(space);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapLetterSpacing, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapLetterSpacing(fd, space);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBitmapAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((antiWhite)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBitmapAntiWhite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTextBitmapAntiWhite(fd, antiWhite);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printTextBitmap(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(text);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTextBitmap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printTextBitmap(fd, text, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printTextBitmapWithAli(int fd, java.lang.String text, int align, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(text);
          _data.writeInt(align);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTextBitmapWithAli, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printTextBitmapWithAli(fd, text, align, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBitmap(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmap(fd, bitmap, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBitmapWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(alignmentMode);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmapWithAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmapWithAlign(fd, bitmap, alignmentMode, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printMultiBitmap(int fd, java.util.List<android.graphics.Bitmap> bitmaps, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeTypedList(bitmaps);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printMultiBitmap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printMultiBitmap(fd, bitmaps, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printMultiBitmapWithAlign(int fd, java.util.List<android.graphics.Bitmap> bitmaps, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeTypedList(bitmaps);
          _data.writeInt(alignmentMode);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printMultiBitmapWithAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printMultiBitmapWithAlign(fd, bitmaps, alignmentMode, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printColumnsText(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStringArray(colsTextArr);
          _data.writeIntArray(colsWidthArr);
          _data.writeIntArray(colsAlignArr);
          _data.writeIntArray(colsSizeArr);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printColumnsText(fd, colsTextArr, colsWidthArr, colsAlignArr, colsSizeArr, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printColumnsString(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStringArray(colsTextArr);
          _data.writeIntArray(colsWidthArr);
          _data.writeIntArray(colsAlignArr);
          _data.writeIntArray(colsSizeArr);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printColumnsString, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printColumnsString(fd, colsTextArr, colsWidthArr, colsAlignArr, colsSizeArr, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setBarCodeWidth(int fd, int width) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(width);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBarCodeWidth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBarCodeWidth(fd, width);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setBarCodeHeight(int fd, int height) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(height);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBarCodeHeight, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBarCodeHeight(fd, height);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setBarCodeContentPrintPos(int fd, int pos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(pos);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBarCodeContentPrintPos, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBarCodeContentPrintPos(fd, pos);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBarCodeWithFull(int fd, java.lang.String data, int barCodeType, int width, int height, int textposition, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeInt(barCodeType);
          _data.writeInt(width);
          _data.writeInt(height);
          _data.writeInt(textposition);
          _data.writeInt(alignmentMode);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarCodeWithFull, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBarCodeWithFull(fd, data, barCodeType, width, height, textposition, alignmentMode, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBarCode(int fd, java.lang.String data, int barCodeType, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeInt(barCodeType);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBarCode(fd, data, barCodeType, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBarCodeWithAlign(int fd, java.lang.String data, int barCodeType, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeInt(barCodeType);
          _data.writeInt(alignmentMode);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarCodeWithAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBarCodeWithAlign(fd, data, barCodeType, alignmentMode, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setQrCodeSize(int fd, int size) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(size);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setQrCodeSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setQrCodeSize(fd, size);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setQrCodeErrorCorrectionLev(int fd, int level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setQrCodeErrorCorrectionLev, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setQrCodeErrorCorrectionLev(fd, level);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setLeftMargin(int fd, int valve) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(valve);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLeftMargin, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setLeftMargin(fd, valve);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printQRCodeWithFull(int fd, java.lang.String data, int size, int errorlevel, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeInt(size);
          _data.writeInt(errorlevel);
          _data.writeInt(alignments);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQRCodeWithFull, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printQRCodeWithFull(fd, data, size, errorlevel, alignments, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printQrCode(int fd, java.lang.String data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQrCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printQrCode(fd, data, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printQrCodeWithAlign(int fd, java.lang.String data, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(data);
          _data.writeInt(alignments);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQrCodeWithAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printQrCodeWithAlign(fd, data, alignments, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQRSize(int fd, int size) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(size);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQRSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQRSize(fd, size);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR1MarginLeft(int fd, int qr1Left) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr1Left);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR1MarginLeft, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR1MarginLeft(fd, qr1Left);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR2MarginLeft(int fd, int qr2Left) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr2Left);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR2MarginLeft, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR2MarginLeft(fd, qr2Left);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR1Level(int fd, int qr1Level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr1Level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR1Level, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR1Level(fd, qr1Level);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR2Level(int fd, int qr2Level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr2Level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR2Level, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR2Level(fd, qr2Level);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR1Version(int fd, int qr1Version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr1Version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR1Version, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR1Version(fd, qr1Version);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDoubleQR2Version(int fd, int qr2Version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(qr2Version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDoubleQR2Version, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDoubleQR2Version(fd, qr2Version);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printDoubleQR(int fd, java.lang.String qr1Data, java.lang.String qr2Data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(qr1Data);
          _data.writeString(qr2Data);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printDoubleQR, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printDoubleQR(fd, qr1Data, qr2Data, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getPrinterUpdatePath(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterUpdatePath, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterUpdatePath(fd);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setPrinterUpdatePath(int fd, java.lang.String path) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeString(path);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrinterUpdatePath, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPrinterUpdatePath(fd, path);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void startPrinterUpdate(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPrinterUpdate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startPrinterUpdate(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterUpdateStatus(int fd, com.imin.printer.IPrinterUpdateCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterUpdateStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterUpdateStatus(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setIsUpdatePrinter(int fd, int update) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(update);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIsUpdatePrinter, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setIsUpdatePrinter(fd, update);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBitmapColorChart(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmapColorChart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmapColorChart(fd, bitmap, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBitmapColorChartWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(alignmentMode);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmapColorChartWithAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmapColorChartWithAlign(fd, bitmap, alignmentMode, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterHardwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterHardwareVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterHardwareVersion(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPrinterIsUpdateStatus(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterIsUpdateStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterIsUpdateStatus(fd, callback);
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
      @Override public void updatePrinterInfo(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updatePrinterInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updatePrinterInfo(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setIsReconnectUsb(int fd, int isConnect) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(isConnect);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIsReconnectUsb, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setIsReconnectUsb(fd, isConnect);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getIsReconnectUsb(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIsReconnectUsb, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getIsReconnectUsb(fd);
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
      @Override public void getConfigurationInfo(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getConfigurationInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getConfigurationInfo(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterKnifeReset(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterKnifeReset, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterKnifeReset(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getPrinterTemperature(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterTemperature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterTemperature(fd, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setConnectInternalPrinter(int fd, boolean connect) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          _data.writeInt(((connect)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setConnectInternalPrinter, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setConnectInternalPrinter(fd, connect);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean getConnectInternalPrinter(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getConnectInternalPrinter, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getConnectInternalPrinter(fd);
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
      @Override public void checkUpdateFirmware(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkUpdateFirmware, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkUpdateFirmware(fd);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.util.List<java.lang.String> getPrinterDensityList(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterDensityList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterDensityList(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> getPrinterSpeedList(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterSpeedList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterSpeedList(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> getPrinterPaperTypeList(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterPaperTypeList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterPaperTypeList(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> getPrinterPatternList(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterPatternList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterPatternList(fd);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean supportCashBox(int fd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supportCashBox, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().supportCashBox(fd);
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
      public static com.imin.printer.INeoPrinterService sDefaultImpl;
    }
    static final int TRANSACTION_initPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_initPrinterParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getPrinterSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getPrinterModelName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getPrinterThermalHead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getPrinterFirmwareVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getPrinterStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getUsbPrinterVidPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getUsbDevicesName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setPrinterDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getPrinterDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setPrinterSpeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getPrinterSpeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getPrinterPaperDistance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getPrinterCutTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setPageFormat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getPrinterMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setPrinterMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getPrinterPaperType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_openDrawer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getDrawerStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getOpenDrawerTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_commitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_exitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setDebugLogLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_setDebugLogSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_setDebugLogModule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getDebugLogState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_printAndLineFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_printAndFeedPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_printAndQuitPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_partialCut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_fullCut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_setFontMultiple = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_setFontBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_setFontAntiWhite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_setFontItalic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_setFontUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_setFontRotate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_setFontDirection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_setFontLineSpacing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_setFontChineseSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_setFontCharSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_setFontChineseSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_setFontCharSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_setFontChineseMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
    static final int TRANSACTION_setFontCountryCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
    static final int TRANSACTION_setFontCodepage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
    static final int TRANSACTION_getFontCountryCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
    static final int TRANSACTION_getFontCodepage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
    static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
    static final int TRANSACTION_printTextWithAli = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
    static final int TRANSACTION_printTextWithEncode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
    static final int TRANSACTION_setCodeAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
    static final int TRANSACTION_setTextBitmapTypeface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
    static final int TRANSACTION_setTextBitmapSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
    static final int TRANSACTION_setTextBitmapStyle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
    static final int TRANSACTION_setTextBitmapStrikeThru = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
    static final int TRANSACTION_setTextBitmapUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
    static final int TRANSACTION_setTextBitmapLineSpacing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
    static final int TRANSACTION_setTextBitmapLetterSpacing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
    static final int TRANSACTION_setTextBitmapAntiWhite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
    static final int TRANSACTION_printTextBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
    static final int TRANSACTION_printTextBitmapWithAli = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
    static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
    static final int TRANSACTION_printBitmapWithAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
    static final int TRANSACTION_printMultiBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
    static final int TRANSACTION_printMultiBitmapWithAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
    static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
    static final int TRANSACTION_printColumnsString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
    static final int TRANSACTION_setBarCodeWidth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
    static final int TRANSACTION_setBarCodeHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
    static final int TRANSACTION_setBarCodeContentPrintPos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
    static final int TRANSACTION_printBarCodeWithFull = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
    static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
    static final int TRANSACTION_printBarCodeWithAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
    static final int TRANSACTION_setQrCodeSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
    static final int TRANSACTION_setQrCodeErrorCorrectionLev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
    static final int TRANSACTION_setLeftMargin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
    static final int TRANSACTION_printQRCodeWithFull = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
    static final int TRANSACTION_printQrCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
    static final int TRANSACTION_printQrCodeWithAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
    static final int TRANSACTION_setDoubleQRSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
    static final int TRANSACTION_setDoubleQR1MarginLeft = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
    static final int TRANSACTION_setDoubleQR2MarginLeft = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
    static final int TRANSACTION_setDoubleQR1Level = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
    static final int TRANSACTION_setDoubleQR2Level = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
    static final int TRANSACTION_setDoubleQR1Version = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
    static final int TRANSACTION_setDoubleQR2Version = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
    static final int TRANSACTION_printDoubleQR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
    static final int TRANSACTION_getPrinterUpdatePath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
    static final int TRANSACTION_setPrinterUpdatePath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
    static final int TRANSACTION_startPrinterUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
    static final int TRANSACTION_getPrinterUpdateStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 99);
    static final int TRANSACTION_setIsUpdatePrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 100);
    static final int TRANSACTION_printBitmapColorChart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 101);
    static final int TRANSACTION_printBitmapColorChartWithAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 102);
    static final int TRANSACTION_getPrinterHardwareVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 103);
    static final int TRANSACTION_getPrinterIsUpdateStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 104);
    static final int TRANSACTION_updatePrinterInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 105);
    static final int TRANSACTION_setIsReconnectUsb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 106);
    static final int TRANSACTION_getIsReconnectUsb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 107);
    static final int TRANSACTION_getConfigurationInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 108);
    static final int TRANSACTION_getPrinterKnifeReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 109);
    static final int TRANSACTION_getPrinterTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 110);
    static final int TRANSACTION_setConnectInternalPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 111);
    static final int TRANSACTION_getConnectInternalPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 112);
    static final int TRANSACTION_checkUpdateFirmware = (android.os.IBinder.FIRST_CALL_TRANSACTION + 113);
    static final int TRANSACTION_getPrinterDensityList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 114);
    static final int TRANSACTION_getPrinterSpeedList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 115);
    static final int TRANSACTION_getPrinterPaperTypeList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 116);
    static final int TRANSACTION_getPrinterPatternList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 117);
    static final int TRANSACTION_supportCashBox = (android.os.IBinder.FIRST_CALL_TRANSACTION + 118);
    public static boolean setDefaultImpl(com.imin.printer.INeoPrinterService impl) {
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
    public static com.imin.printer.INeoPrinterService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int initPrinter(java.lang.String packageName, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void initPrinterParams(int fd) throws android.os.RemoteException;
  public void getPrinterSerialNumber(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterModelName(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterThermalHead(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterFirmwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public java.lang.String getServiceVersion(int fd) throws android.os.RemoteException;
  public int getPrinterStatus(int fd) throws android.os.RemoteException;
  public java.lang.String getUsbPrinterVidPid(int fd) throws android.os.RemoteException;
  public java.lang.String getUsbDevicesName(int fd) throws android.os.RemoteException;
  public void setPrinterDensity(int fd, int density) throws android.os.RemoteException;
  public int getPrinterDensity(int fd) throws android.os.RemoteException;
  public void setPrinterSpeed(int fd, int speed) throws android.os.RemoteException;
  public int getPrinterSpeed(int fd) throws android.os.RemoteException;
  public void getPrinterPaperDistance(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterCutTimes(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setPageFormat(int fd, int format) throws android.os.RemoteException;
  public int getPrinterMode(int fd) throws android.os.RemoteException;
  public void setPrinterMode(int fd, int mode) throws android.os.RemoteException;
  public int getPrinterPaperType(int fd) throws android.os.RemoteException;
  public void openDrawer(int fd) throws android.os.RemoteException;
  public boolean getDrawerStatus(int fd) throws android.os.RemoteException;
  public int getOpenDrawerTimes(int fd) throws android.os.RemoteException;
  public void printerSelfChecking(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void sendRAWData(int fd, byte[] bytes, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void enterPrinterBuffer(int fd, boolean clean) throws android.os.RemoteException;
  public void commitPrinterBuffer(int fd) throws android.os.RemoteException;
  public void commitPrinterBufferWithCallback(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void exitPrinterBuffer(int fd, boolean commit) throws android.os.RemoteException;
  public void exitPrinterBufferWithCallback(int fd, boolean commit, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setDebugLogLevel(int fd, int level) throws android.os.RemoteException;
  public void setDebugLogSize(int fd, int size) throws android.os.RemoteException;
  public void setDebugLogModule(int fd, java.lang.String module, boolean isOpen) throws android.os.RemoteException;
  public java.lang.String getDebugLogState(int fd) throws android.os.RemoteException;
  public void printAndLineFeed(int fd) throws android.os.RemoteException;
  public void printAndFeedPaper(int fd, int value) throws android.os.RemoteException;
  public void printAndQuitPaper(int fd, int value) throws android.os.RemoteException;
  public void partialCut(int fd) throws android.os.RemoteException;
  public void fullCut(int fd) throws android.os.RemoteException;
  public void setFontMultiple(int fd, int wide, int high) throws android.os.RemoteException;
  public void setFontBold(int fd, boolean bold) throws android.os.RemoteException;
  public void setFontAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException;
  public void setFontItalic(int fd, boolean italic) throws android.os.RemoteException;
  public void setFontUnderline(int fd, int underline) throws android.os.RemoteException;
  public void setFontRotate(int fd, int rotate) throws android.os.RemoteException;
  public void setFontDirection(int fd, int direction) throws android.os.RemoteException;
  public void setFontLineSpacing(int fd, int space) throws android.os.RemoteException;
  public void setFontChineseSpace(int fd, int chsLeftSpace, int chsRightSpace) throws android.os.RemoteException;
  public void setFontCharSpace(int fd, int space) throws android.os.RemoteException;
  public void setFontChineseSize(int fd, int height, int width, int underLine, int chineseType) throws android.os.RemoteException;
  public void setFontCharSize(int fd, int height, int width, int underLine, int asciitype) throws android.os.RemoteException;
  public void setFontChineseMode(int fd, int mode) throws android.os.RemoteException;
  public void setFontCountryCode(int fd, int country) throws android.os.RemoteException;
  public void setFontCodepage(int fd, int codepage) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getFontCountryCode(int fd) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getFontCodepage(int fd) throws android.os.RemoteException;
  public void printText(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printTextWithAli(int fd, java.lang.String text, int anInt, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printTextWithEncode(int fd, java.lang.String text, java.lang.String code, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setCodeAlignment(int fd, int alignmentMode) throws android.os.RemoteException;
  public void setTextBitmapTypeface(int fd, java.lang.String typeface) throws android.os.RemoteException;
  public void setTextBitmapSize(int fd, int size) throws android.os.RemoteException;
  public void setTextBitmapStyle(int fd, int style) throws android.os.RemoteException;
  public void setTextBitmapStrikeThru(int fd, boolean strikeThru) throws android.os.RemoteException;
  public void setTextBitmapUnderline(int fd, boolean haveUnderline) throws android.os.RemoteException;
  public void setTextBitmapLineSpacing(int fd, float space) throws android.os.RemoteException;
  public void setTextBitmapLetterSpacing(int fd, float space) throws android.os.RemoteException;
  public void setTextBitmapAntiWhite(int fd, boolean antiWhite) throws android.os.RemoteException;
  public void printTextBitmap(int fd, java.lang.String text, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printTextBitmapWithAli(int fd, java.lang.String text, int align, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printBitmap(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printBitmapWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printMultiBitmap(int fd, java.util.List<android.graphics.Bitmap> bitmaps, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printMultiBitmapWithAlign(int fd, java.util.List<android.graphics.Bitmap> bitmaps, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printColumnsText(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printColumnsString(int fd, java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setBarCodeWidth(int fd, int width) throws android.os.RemoteException;
  public void setBarCodeHeight(int fd, int height) throws android.os.RemoteException;
  public void setBarCodeContentPrintPos(int fd, int pos) throws android.os.RemoteException;
  public void printBarCodeWithFull(int fd, java.lang.String data, int barCodeType, int width, int height, int textposition, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printBarCode(int fd, java.lang.String data, int barCodeType, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printBarCodeWithAlign(int fd, java.lang.String data, int barCodeType, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setQrCodeSize(int fd, int size) throws android.os.RemoteException;
  public void setQrCodeErrorCorrectionLev(int fd, int level) throws android.os.RemoteException;
  public void setLeftMargin(int fd, int valve) throws android.os.RemoteException;
  public void printQRCodeWithFull(int fd, java.lang.String data, int size, int errorlevel, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printQrCode(int fd, java.lang.String data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printQrCodeWithAlign(int fd, java.lang.String data, int alignments, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setDoubleQRSize(int fd, int size) throws android.os.RemoteException;
  public void setDoubleQR1MarginLeft(int fd, int qr1Left) throws android.os.RemoteException;
  public void setDoubleQR2MarginLeft(int fd, int qr2Left) throws android.os.RemoteException;
  public void setDoubleQR1Level(int fd, int qr1Level) throws android.os.RemoteException;
  public void setDoubleQR2Level(int fd, int qr2Level) throws android.os.RemoteException;
  public void setDoubleQR1Version(int fd, int qr1Version) throws android.os.RemoteException;
  public void setDoubleQR2Version(int fd, int qr2Version) throws android.os.RemoteException;
  public void printDoubleQR(int fd, java.lang.String qr1Data, java.lang.String qr2Data, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public java.lang.String getPrinterUpdatePath(int fd) throws android.os.RemoteException;
  public void setPrinterUpdatePath(int fd, java.lang.String path) throws android.os.RemoteException;
  public void startPrinterUpdate(int fd) throws android.os.RemoteException;
  public void getPrinterUpdateStatus(int fd, com.imin.printer.IPrinterUpdateCallback callback) throws android.os.RemoteException;
  public void setIsUpdatePrinter(int fd, int update) throws android.os.RemoteException;
  public void printBitmapColorChart(int fd, android.graphics.Bitmap bitmap, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void printBitmapColorChartWithAlign(int fd, android.graphics.Bitmap bitmap, int alignmentMode, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterHardwareVersion(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public int getPrinterIsUpdateStatus(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void updatePrinterInfo(int fd) throws android.os.RemoteException;
  public void setIsReconnectUsb(int fd, int isConnect) throws android.os.RemoteException;
  public int getIsReconnectUsb(int fd) throws android.os.RemoteException;
  public void getConfigurationInfo(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterKnifeReset(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void getPrinterTemperature(int fd, com.imin.printer.IPrinterCallback callback) throws android.os.RemoteException;
  public void setConnectInternalPrinter(int fd, boolean connect) throws android.os.RemoteException;
  public boolean getConnectInternalPrinter(int fd) throws android.os.RemoteException;
  public void checkUpdateFirmware(int fd) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getPrinterDensityList(int fd) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getPrinterSpeedList(int fd) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getPrinterPaperTypeList(int fd) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getPrinterPatternList(int fd) throws android.os.RemoteException;
  public boolean supportCashBox(int fd) throws android.os.RemoteException;
}

package com.imin.printer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class PrinterHelper {
    private static final String TAG = "NeoPrinterLibrary_PrinterHelper";

    private static PrinterHelper helper = new PrinterHelper();
    private static INeoPrinterService iNeoPrinterService;
    private PrinterHelper() {}

    public static PrinterHelper getInstance() {
        return helper;
    }
    public static INeoPrinterService getNeoPrinterService(){
        return iNeoPrinterService;
    }
    private Context mContext;

    /**
     * init  print service
     */
    public boolean initPrinterService(Context context){
        mContext = context;
        boolean result = NeoPrinterManager.getInstance().bindService(context,serviceConnectionCallback);
        Log.d(TAG,result ? "绑定服务成功" : "绑定服务失败");
        return result;
    }

    /**
     *  deInit print service
     */
    public void deInitPrinterService(Context context){
        NeoPrinterManager.getInstance().unBindService(context,serviceConnectionCallback);
    }

    ServiceConnectionCallback serviceConnectionCallback = new ServiceConnectionCallback() {
        @Override
        protected void onConnected(INeoPrinterService service) {
            iNeoPrinterService = service;
            Log.d(TAG,"绑定AIDL服务成功");
            initPrinter(mContext.getApplicationContext().getPackageName(), null);
        }

        @Override
        protected void onDisconnected() {
            iNeoPrinterService = null;
            Log.d(TAG,"AIDL服务已断开");
        }
    };
    int fd;
    public void initPrinter(String packageName,INeoPrinterCallback callback){
        Log.d(TAG,"绑定服务成功"+(iNeoPrinterService == null || packageName == null || packageName.equals("") || packageName.length() == 0)+"    "+packageName);
        if (iNeoPrinterService == null || packageName == null || packageName.equals("") || packageName.length() == 0)return;
        try {
            fd = iNeoPrinterService.initPrinter(packageName, callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void initPrinterParams(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.initPrinterParams(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //序列号
    public void getPrinterSerialNumber(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterSerialNumber(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void getPrinterModelName(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterModelName(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void getPrinterThermalHead(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterThermalHead(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void getPrinterFirmwareVersion(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterFirmwareVersion(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getServiceVersion(){
        String version = "";
        if (iNeoPrinterService == null)return version;

        try {
            version = iNeoPrinterService.getServiceVersion(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return version;
    }
    public int getPrinterStatus(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getPrinterStatus(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public String getUsbPrinterVidPid(){
        String vidPid = "";
        if (iNeoPrinterService == null)return vidPid;

        try {
            vidPid = iNeoPrinterService.getUsbPrinterVidPid(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return vidPid;
    }

    public String getUsbDevicesName(){
        String devicesName = "";
        if (iNeoPrinterService == null)return devicesName;

        try {
            devicesName = iNeoPrinterService.getUsbDevicesName(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return devicesName;
    }

    public void setPrinterDensity(int density){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPrinterDensity(fd,density);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int getPrinterDensity(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getPrinterDensity(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void setPrinterSpeed(int density){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPrinterSpeed(fd,density);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int getPrinterSpeed(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getPrinterSpeed(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void getPrinterPaperDistance(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterPaperDistance(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getPrinterCutTimes(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterCutTimes(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPageFormat(int density){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPageFormat(fd,density);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int getPrinterMode(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getPrinterMode(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void setPrinterMode(int density){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPrinterMode(fd,density);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int getPrinterPaperType(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getPrinterPaperType(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void openDrawer(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.openDrawer(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean getDrawerStatus(){
        boolean status = false;
        if (iNeoPrinterService == null)return status;
        try {
            status = iNeoPrinterService.getDrawerStatus(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public int getOpenDrawerTimes(){
        int status = -1;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getOpenDrawerTimes(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void printerSelfChecking(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printerSelfChecking(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void sendRAWData(byte[] b,INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.sendRAWData(fd,b,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void enterPrinterBuffer(boolean b){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.enterPrinterBuffer(fd,b);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void exitPrinterBuffer(boolean b){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.exitPrinterBuffer(fd,b);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void exitPrinterBuffer(boolean b,INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.exitPrinterBufferWithCallback(fd,b,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void commitPrinterBuffer(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.commitPrinterBuffer(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void commitPrinterBuffer(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.commitPrinterBufferWithCallback(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setDebugLogLevel(int level){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDebugLogLevel(fd,level);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDebugLogSize(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDebugLogSize(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDebugLogModule(String module, boolean isOpen){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDebugLogModule(fd,module,isOpen);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getDebugLogState(){
        String devicesName = "";
        if (iNeoPrinterService == null)return devicesName;

        try {
            devicesName = iNeoPrinterService.getDebugLogState(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return devicesName;
    }
    public void printAndLineFeed(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printAndLineFeed(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printAndFeedPaper(int value){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printAndFeedPaper(fd,value);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printAndQuitPaper(int value){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printAndQuitPaper(fd,value);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void partialCut(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.partialCut(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void fullCut(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.fullCut(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontMultiple(int wide, int high){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontMultiple(fd,wide,high);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontBold(boolean bold){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontBold(fd,bold);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontAntiWhite(boolean antiWhite){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontAntiWhite(fd,antiWhite);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontItalic(boolean italic){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontItalic(fd,italic);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontUnderline(int underline){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontUnderline(fd,underline);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontRotate(int rotate){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontRotate(fd,rotate);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontDirection(int direction){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontDirection(fd,direction);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontLineSpacing(int space){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontLineSpacing(fd,space);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontChineseSpace(int chsLeftSpace, int chsRightSpace){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontChineseSpace(fd,chsLeftSpace,chsRightSpace);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontCharSpace(int space){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontCharSpace(fd,space);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontChineseSize(int height, int width, int underLine, int chineseType){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontChineseSize(fd,height,width,underLine,chineseType);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setFontCharSize(int height, int width, int underLine, int chineseType){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontCharSize(fd,height,width,underLine,chineseType);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontChineseMode(int mode){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontChineseMode(fd,mode);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontCountryCode(int country){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontCountryCode(fd,country);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setFontCodepage(int codepage){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setFontCodepage(fd,codepage);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public List<String> getFontCountryCode(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getFontCountryCode(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getFontCodepage(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getFontCodepage(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getPrinterDensityList(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getPrinterDensityList(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getPrinterSpeedList(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getPrinterSpeedList(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getPrinterPaperTypeList(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getPrinterPaperTypeList(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getPrinterPatternList(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getPrinterPatternList(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean supportCashBox(){

        boolean status = false;
        if (iNeoPrinterService == null)return false;
        try {
            status = iNeoPrinterService.supportCashBox(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void printText(String text,INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printText(fd,text,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printTextWithAli(String text,int anInt, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printTextWithAli(fd,text,anInt,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printTextWithEncode(String text,String code, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printTextWithEncode(fd,text,code,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置全局对齐方式
     * @param alignmentMode
     */
    public void setCodeAlignment(int alignmentMode){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setCodeAlignment(fd,alignmentMode);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setTextBitmapTypeface(String typeface){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapTypeface(fd,typeface);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setTextBitmapSize(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapSize(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setTextBitmapStyle(int style){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapStyle(fd,style);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setTextBitmapStrikeThru(boolean strikeThru){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapStrikeThru(fd,strikeThru);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setTextBitmapUnderline(boolean haveUnderline){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapUnderline(fd,haveUnderline);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setTextBitmapLineSpacing(float space){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapLineSpacing(fd,space);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setTextBitmapLetterSpacing(float space){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapLetterSpacing(fd,space);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setTextBitmapAntiWhite(boolean antiWhite){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setTextBitmapAntiWhite(fd,antiWhite);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printTextBitmap(String text, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printTextBitmap(fd,text,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printTextBitmapWithAli(String text,int align,  INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printTextBitmapWithAli(fd,text,align,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printBitmap(Bitmap bitmap, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBitmap(fd,bitmap,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printBitmapWithAlign(Bitmap bitmap,int alignmentMode, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBitmapWithAlign(fd,bitmap,alignmentMode,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printMultiBitmap(List<Bitmap> bitmaps, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printMultiBitmap(fd,bitmaps,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printMultiBitmapWithAlign(List<Bitmap> bitmaps, int alignmentMode, INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printMultiBitmapWithAlign(fd,bitmaps,alignmentMode,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printColumnsText(fd,colsTextArr,colsWidthArr,colsAlignArr,colsSizeArr,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printColumnsString(String[] colsTextArr, int[] colsWidthArr, int[] colsAlignArr, int[] colsSizeArr, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printColumnsString(fd,colsTextArr,colsWidthArr,colsAlignArr,colsSizeArr,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setBarCodeWidth(int width){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setBarCodeWidth(fd,width);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setBarCodeHeight(int height){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setBarCodeHeight(fd,height);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setBarCodeContentPrintPos(int pos){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setBarCodeContentPrintPos(fd,pos);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printBarCodeWithFull(String data, int barCodeType, int width, int height, int textposition, int alignmentMode, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBarCodeWithFull(fd,data,barCodeType,width,height,textposition,alignmentMode,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printBarCode(String data, int barCodeType, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBarCode(fd,data,barCodeType,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printBarCodeWithAlign(String data, int barCodeType, int alignmentMode, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBarCodeWithAlign(fd,data,barCodeType,alignmentMode,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setQrCodeSize(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setQrCodeSize(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setQrCodeErrorCorrectionLev(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setQrCodeErrorCorrectionLev(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setLeftMargin(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setLeftMargin(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printQRCodeWithFull(String data, int size, int errorlevel, int alignments, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printQRCodeWithFull(fd,data,size,errorlevel,alignments,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printQrCode(String data, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printQrCode(fd,data,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printQrCodeWithAlign(String data,int alignments, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printQrCodeWithAlign(fd,data,alignments,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setDoubleQRSize(int size){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQRSize(fd,size);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR1MarginLeft(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR1MarginLeft(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR2MarginLeft(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR2MarginLeft(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR1Level(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR1Level(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR2Level(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR2Level(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR1Version(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR1Version(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setDoubleQR2Version(int qr1Left){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setDoubleQR2Version(fd,qr1Left);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void printDoubleQR(String qr1Data, String qr2Data, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printDoubleQR(fd,qr1Data,qr2Data,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPrinterUpdatePath(String path){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPrinterUpdatePath(fd,path);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getPrinterUpdateStatus(IPrinterUpdateCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterUpdateStatus(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void startPrinterUpdate(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.startPrinterUpdate(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public void setIsUpdatePrinter(int update){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setIsUpdatePrinter(fd,update);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printBitmapColorChart(Bitmap bitmap, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBitmapColorChart(fd,bitmap,null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void printBitmapColorChartWithAlign(Bitmap bitmap,int align, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.printBitmapColorChartWithAlign(fd,bitmap,align,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getPrinterHardwareVersion(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterHardwareVersion(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public int getPrinterIsUpdateStatus(){
        if (iNeoPrinterService == null)return 0;
        try {
          return iNeoPrinterService.getPrinterIsUpdateStatus(fd,null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public void updatePrinterInfo(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.updatePrinterInfo(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setIsReconnectUsb(int reconnectUsb){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setIsReconnectUsb(fd,reconnectUsb);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public int getIsReconnectUsb(){
        int status = 0;
        if (iNeoPrinterService == null)return status;

        try {
            status = iNeoPrinterService.getIsReconnectUsb(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void getConfigurationInfo(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getConfigurationInfo(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getPrinterKnifeReset(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterKnifeReset(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getPrinterTemperature(INeoPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterTemperature(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    public boolean getConnectInternalPrinter(){
        if (iNeoPrinterService == null)return true;
        try {
            return iNeoPrinterService.getConnectInternalPrinter(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void setConnectInternalPrinter(boolean isConnect){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setConnectInternalPrinter(fd,isConnect);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void checkUpdateFirmware(){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.checkUpdateFirmware(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPrinterEncode(int encode) {
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.setPrinterEncode(fd, encode);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void partialCutAndFeedPaper(int length){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.partialCutAndFeedPaper(fd, length);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void fullCutAndFeedPaper(int length){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.fullCutAndFeedPaper(fd, length);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getPrinterSupplierName(){
        String supplierName = "";
        if (iNeoPrinterService == null)return supplierName;
        try {
            supplierName = iNeoPrinterService.getPrinterSupplierName(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return supplierName;
    }

    public List<String> getEncodeList(){
        List<String> list = new ArrayList<>();
        if (iNeoPrinterService == null)return list;
        try {
            list = iNeoPrinterService.getEncodeList(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }

    public String getCurCodepage(){
        String codepage = "";
        if (iNeoPrinterService == null)return codepage;
        try {
            codepage = iNeoPrinterService.getCurCodepage(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return codepage;
    }

    public String getCurEncode(){
        String encode = "";
        if (iNeoPrinterService == null)return encode;
        try {
            encode = iNeoPrinterService.getCurEncode(fd);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return encode;
    }

    public void getPrinterParameter(int code, IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.getPrinterParameter(fd,code,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void regesiterPrinterStatusCallback(IPrinterCallback callback){
        if (iNeoPrinterService == null)return;
        try {
            iNeoPrinterService.regesiterPrinterStatusCallback(fd,callback);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

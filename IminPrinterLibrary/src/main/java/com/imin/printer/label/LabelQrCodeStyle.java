package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

import com.imin.printer.enums.ErrorLevel;
import com.imin.printer.enums.Rotate;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelQrCodeStyle implements Parcelable {
    private int posX;
    private int posY;
    private int size;
    private int errorLevel;
    private int rotate;
    private int width;
    private int height;

    private LabelQrCodeStyle(){
        posX = 0;
        posY = 0;
        size = 4;
        errorLevel = 0;
        rotate = 0;
        width = -1;
        height = -1;
    }

    protected LabelQrCodeStyle(Parcel in) {
        posX = in.readInt();
        posY = in.readInt();
        size = in.readInt();
        errorLevel = in.readInt();
        rotate = in.readInt();
        width = in.readInt();
        height = in.readInt();
    }

    public static final Creator<LabelQrCodeStyle> CREATOR = new Creator<LabelQrCodeStyle>() {
        @Override
        public LabelQrCodeStyle createFromParcel(Parcel in) {
            return new LabelQrCodeStyle(in);
        }

        @Override
        public LabelQrCodeStyle[] newArray(int size) {
            return new LabelQrCodeStyle[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(posX);
        parcel.writeInt(posY);
        parcel.writeInt(size);
        parcel.writeInt(errorLevel);
        parcel.writeInt(rotate);
        parcel.writeInt(width);
        parcel.writeInt(height);
    }

    public static LabelQrCodeStyle getQrCodeStyle(){
        return new LabelQrCodeStyle();
    }

    public LabelQrCodeStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelQrCodeStyle setPosY(int posY) {
        this.posY = posY;
        return this;
    }

    public LabelQrCodeStyle setSize(int size) {
        this.size = size;
        return this;
    }

    public LabelQrCodeStyle setErrorLevel(ErrorLevel errorLevel) {
        this.errorLevel = errorLevel.ordinal();
        return this;
    }

    public LabelQrCodeStyle setRotate(Rotate rotate) {
        this.rotate = rotate.ordinal();
        return this;
    }

    public LabelQrCodeStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelQrCodeStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getSize() {
        return size;
    }

    public int getErrorLevel() {
        return errorLevel;
    }

    public int getRotate() {
        return rotate;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LabelQrCodeStyle{");
        sb.append("posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append(", size=").append(size);
        sb.append(", errorLevel=").append(errorLevel);
        sb.append(", rotate=").append(rotate);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

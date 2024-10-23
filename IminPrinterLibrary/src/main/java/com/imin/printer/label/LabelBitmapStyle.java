package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

import com.imin.printer.enums.ImageAlgorithm;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelBitmapStyle implements Parcelable {
    private int posX;
    private int posY;
    private int algorithm;
    private int value;
    private int width;
    private int height;

    private LabelBitmapStyle(){
        posX = 0;
        posY = 0;
        algorithm = 0;
        value = 200;
        width = -1;
        height = -1;
    }

    protected LabelBitmapStyle(Parcel in) {
        posX = in.readInt();
        posY = in.readInt();
        algorithm = in.readInt();
        value = in.readInt();
        width = in.readInt();
        height = in.readInt();
    }

    public static final Creator<LabelBitmapStyle> CREATOR = new Creator<LabelBitmapStyle>() {
        @Override
        public LabelBitmapStyle createFromParcel(Parcel in) {
            return new LabelBitmapStyle(in);
        }

        @Override
        public LabelBitmapStyle[] newArray(int size) {
            return new LabelBitmapStyle[size];
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
        parcel.writeInt(algorithm);
        parcel.writeInt(value);
        parcel.writeInt(width);
        parcel.writeInt(height);
    }

    public static LabelBitmapStyle getBitmapStyle(){
        return new LabelBitmapStyle();
    }

    public LabelBitmapStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelBitmapStyle setPosY(int posY) {
        this.posY = posY;
        return this;
    }

    public LabelBitmapStyle setAlgorithm(ImageAlgorithm imageAlgorithm) {
        this.algorithm = imageAlgorithm.ordinal();
        return this;
    }

    public LabelBitmapStyle setValue(int value) {
        this.value = value;
        return this;
    }

    public LabelBitmapStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelBitmapStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getAlgorithm() {
        return algorithm;
    }

    public int getValue() {
        return value;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LabelBitmapStyle{");
        sb.append("posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", value=").append(value);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

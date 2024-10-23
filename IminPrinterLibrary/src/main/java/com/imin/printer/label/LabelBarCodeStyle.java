package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

import com.imin.printer.enums.Align;
import com.imin.printer.enums.HumanReadable;
import com.imin.printer.enums.Rotate;
import com.imin.printer.enums.Symbology;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelBarCodeStyle implements Parcelable {
    private int posX;
    private int posY;
    private int dotWidth;
    private int barHeight;
    private int readable;
    private int symbology;
    private int align;
    private int rotate;
    private int width;
    private int height;

    private LabelBarCodeStyle(){
        posX = 0;
        posY = 0;
        dotWidth = 2;
        barHeight = 162;
        readable = 0;
        symbology = 4;
        align = 0;
        rotate = 0;
        width = -1;
        height = -1;
    }


    protected LabelBarCodeStyle(Parcel in) {
        posX = in.readInt();
        posY = in.readInt();
        dotWidth = in.readInt();
        barHeight = in.readInt();
        readable = in.readInt();
        symbology = in.readInt();
        align = in.readInt();
        rotate = in.readInt();
        width = in.readInt();
        height = in.readInt();
    }

    public static final Creator<LabelBarCodeStyle> CREATOR = new Creator<LabelBarCodeStyle>() {
        @Override
        public LabelBarCodeStyle createFromParcel(Parcel in) {
            return new LabelBarCodeStyle(in);
        }

        @Override
        public LabelBarCodeStyle[] newArray(int size) {
            return new LabelBarCodeStyle[size];
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
        parcel.writeInt(dotWidth);
        parcel.writeInt(barHeight);
        parcel.writeInt(readable);
        parcel.writeInt(symbology);
        parcel.writeInt(align);
        parcel.writeInt(rotate);
        parcel.writeInt(width);
        parcel.writeInt(height);
    }

    public static LabelBarCodeStyle getBarCodeStyle(){
        return new LabelBarCodeStyle();
    }

    public LabelBarCodeStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelBarCodeStyle setPosY(int posY) {
        this.posY = posY;
        return this;
    }

    public LabelBarCodeStyle setDotWidth(int dotWidth) {
        this.dotWidth = dotWidth;
        return this;
    }

    public LabelBarCodeStyle setBarHeight(int barHeight) {
        this.barHeight = barHeight;
        return this;
    }

    public LabelBarCodeStyle setReadable(HumanReadable humanReadable) {
        this.readable = humanReadable.ordinal();
        return this;
    }

    public LabelBarCodeStyle setSymbology(Symbology symbology) {
        this.symbology = symbology.ordinal();
        return this;
    }

    public LabelBarCodeStyle setAlign(Align align) {
        this.align = align.ordinal();
        return this;
    }

    public LabelBarCodeStyle setRotate(Rotate rotate) {
        this.rotate = rotate.ordinal();
        return this;
    }

    public LabelBarCodeStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelBarCodeStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getDotWidth() {
        return dotWidth;
    }

    public int getBarHeight() {
        return barHeight;
    }

    public int getReadable() {
        return readable;
    }

    public int getSymbology() {
        return symbology;
    }

    public int getAlign() {
        return align;
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
        final StringBuffer sb = new StringBuffer("LabelBarcodeStyle{");
        sb.append("posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append(", dotWidth=").append(dotWidth);
        sb.append(", barHeight=").append(barHeight);
        sb.append(", readable=").append(readable);
        sb.append(", symbology=").append(symbology);
        sb.append(", align=").append(align);
        sb.append(", rotate=").append(rotate);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

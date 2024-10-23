package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

import com.imin.printer.enums.Shape;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelAreaStyle implements Parcelable {
    private int style;
    private int width;
    private int height;
    private int posX;
    private int posY;
    private int endX;
    private int endY;
    private int thick;

    private LabelAreaStyle(){
        style = 0;
        width = 50;
        height = 50;
        posX = 0;
        posY = 0;
        endX = 50;
        endY = 50;
        thick = 1;
    }

    protected LabelAreaStyle(Parcel in) {
        style = in.readInt();
        width = in.readInt();
        height = in.readInt();
        posX = in.readInt();
        posY = in.readInt();
        endX = in.readInt();
        endY = in.readInt();
        thick = in.readInt();
    }

    public static final Creator<LabelAreaStyle> CREATOR = new Creator<LabelAreaStyle>() {
        @Override
        public LabelAreaStyle createFromParcel(Parcel in) {
            return new LabelAreaStyle(in);
        }

        @Override
        public LabelAreaStyle[] newArray(int size) {
            return new LabelAreaStyle[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(style);
        parcel.writeInt(width);
        parcel.writeInt(height);
        parcel.writeInt(posX);
        parcel.writeInt(posY);
        parcel.writeInt(endX);
        parcel.writeInt(endY);
        parcel.writeInt(thick);
    }

    public static LabelAreaStyle getAreaStyle(){
        return new LabelAreaStyle();
    }

    public LabelAreaStyle setStyle(Shape shape) {
        this.style = shape.ordinal();
        return this;
    }

    public LabelAreaStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelAreaStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public LabelAreaStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelAreaStyle setPosY(int posY) {
        this.posY = posY;
        return this;
    }

    public LabelAreaStyle setEndX(int endX) {
        this.endX = endX;
        return this;
    }

    public LabelAreaStyle setEndY(int endY) {
        this.endY = endY;
        return this;
    }

    public LabelAreaStyle setThick(int thick) {
        this.thick = thick;
        return this;
    }

    public int getStyle() {
        return style;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public int getThick() {
        return thick;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LabelAreaStyle{");
        sb.append("style=").append(style);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append(", endX=").append(endX);
        sb.append(", endY=").append(endY);
        sb.append(", thick=").append(thick);
        sb.append('}');
        return sb.toString();
    }
}

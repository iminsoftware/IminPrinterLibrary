package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelCanvasStyle implements Parcelable {
    private int width;
    private int height;
    private int posX;
    private int posY;

    private LabelCanvasStyle(){
        width = 0;
        height = 0;
        posX = 0;
        posY = 0;
    }

    protected LabelCanvasStyle(Parcel in) {
        width = in.readInt();
        height = in.readInt();
        posX = in.readInt();
        posY = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeInt(posX);
        dest.writeInt(posY);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LabelCanvasStyle> CREATOR = new Creator<LabelCanvasStyle>() {
        @Override
        public LabelCanvasStyle createFromParcel(Parcel in) {
            return new LabelCanvasStyle(in);
        }

        @Override
        public LabelCanvasStyle[] newArray(int size) {
            return new LabelCanvasStyle[size];
        }
    };

    public static LabelCanvasStyle getCanvasStyle(){
        return new LabelCanvasStyle();
    }

    public LabelCanvasStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelCanvasStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public LabelCanvasStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelCanvasStyle setPosY(int posY) {
        this.posY = posY;
        return this;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LabelCanvasStyle{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append('}');
        return sb.toString();
    }
}

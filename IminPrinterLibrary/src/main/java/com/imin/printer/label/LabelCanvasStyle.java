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
    private boolean enableReverse;
    private boolean enableMirror;

    private LabelCanvasStyle(){
        width = 0;
        height = 0;
        posX = 0;
        posY = 0;
        enableReverse = false;
        enableMirror = false;
    }

    protected LabelCanvasStyle(Parcel in) {
        width = in.readInt();
        height = in.readInt();
        posX = in.readInt();
        posY = in.readInt();
        enableReverse = in.readByte() != 0;
        enableMirror = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeInt(posX);
        dest.writeInt(posY);
        dest.writeByte((byte) (enableReverse ? 1 : 0));
        dest.writeByte((byte) (enableMirror ? 1 : 0));
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

    public LabelCanvasStyle setEnableReverse(boolean enableReverse) {
        this.enableReverse = enableReverse;
        return this;
    }

    public LabelCanvasStyle setEnableMirror(boolean enableMirror) {
        this.enableMirror = enableMirror;
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

    public boolean isEnableReverse() {
        return enableReverse;
    }

    public boolean isEnableMirror() {
        return enableMirror;
    }

    @Override
    public String toString() {
        return "LabelCanvasStyle{" +
                "width=" + width +
                ", height=" + height +
                ", posX=" + posX +
                ", posY=" + posY +
                ", enableReverse=" + enableReverse +
                ", enableMirror=" + enableMirror +
                '}';
    }
}

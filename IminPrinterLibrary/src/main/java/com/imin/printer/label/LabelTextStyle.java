package com.imin.printer.label;

import android.os.Parcel;
import android.os.Parcelable;

import com.imin.printer.enums.Align;
import com.imin.printer.enums.Rotate;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public class LabelTextStyle implements Parcelable {
    private int posX;
    private int posY;
    private int textSize;
    private int textWidthRatio;
    private int textHeightRatio;
    private int width;
    private int height;
    private int align;
    private int rotate;
    private int textSpace;
    private boolean enableBold;
    private boolean enableUnderline;
    private boolean enableStrikethrough;
    private boolean enableItalics;
    private boolean enAntiColor;

    private LabelTextStyle(){
        posX = 0;
        posY = 0;
        textSize = 24;
        textWidthRatio = 0;
        textHeightRatio = 0;
        width = -1;
        height = -1;
        align = 0;
        rotate = 0;
        textSpace = 0;
        enableBold = false;
        enableUnderline = false;
        enableStrikethrough = false;
        enableItalics = false;
        enAntiColor = false;
    }

    protected LabelTextStyle(Parcel in) {
        posX = in.readInt();
        posY = in.readInt();
        textSize = in.readInt();
        textWidthRatio = in.readInt();
        textHeightRatio = in.readInt();
        width = in.readInt();
        height = in.readInt();
        align = in.readInt();
        rotate = in.readInt();
        textSpace = in.readInt();
        enableBold = in.readByte() != 0;
        enableUnderline = in.readByte() != 0;
        enableStrikethrough = in.readByte() != 0;
        enableItalics = in.readByte() != 0;
        enAntiColor = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(posX);
        dest.writeInt(posY);
        dest.writeInt(textSize);
        dest.writeInt(textWidthRatio);
        dest.writeInt(textHeightRatio);
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeInt(align);
        dest.writeInt(rotate);
        dest.writeInt(textSpace);
        dest.writeByte((byte) (enableBold ? 1 : 0));
        dest.writeByte((byte) (enableUnderline ? 1 : 0));
        dest.writeByte((byte) (enableStrikethrough ? 1 : 0));
        dest.writeByte((byte) (enableItalics ? 1 : 0));
        dest.writeByte((byte) (enAntiColor ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LabelTextStyle> CREATOR = new Creator<LabelTextStyle>() {
        @Override
        public LabelTextStyle createFromParcel(Parcel in) {
            return new LabelTextStyle(in);
        }

        @Override
        public LabelTextStyle[] newArray(int size) {
            return new LabelTextStyle[size];
        }
    };

    public static LabelTextStyle getTextStyle(){
        return new LabelTextStyle();
    }

    public LabelTextStyle setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public LabelTextStyle setPosY(int posY) {
        this.posY = posY;
        return this;
    }

    public LabelTextStyle setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public LabelTextStyle setTextWidthRatio(int textWidthRatio) {
        this.textWidthRatio = textWidthRatio;
        return this;
    }

    public LabelTextStyle setTextHeightRatio(int textHeightRatio) {
        this.textHeightRatio = textHeightRatio;
        return this;
    }

    public LabelTextStyle setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabelTextStyle setHeight(int height) {
        this.height = height;
        return this;
    }

    public LabelTextStyle setAlign(Align align) {
        this.align = align.ordinal();
        return this;
    }

    public LabelTextStyle setRotate(Rotate rotate) {
        this.rotate = rotate.ordinal();
        return this;
    }

    public LabelTextStyle setTextSpace(int textSpace) {
        this.textSpace = textSpace;
        return this;
    }

    public LabelTextStyle setEnableBold(boolean enableBold) {
        this.enableBold = enableBold;
        return this;
    }

    public LabelTextStyle setEnableUnderline(boolean enableUnderline) {
        this.enableUnderline = enableUnderline;
        return this;
    }

    public LabelTextStyle setEnableStrikethrough(boolean enableStrikethrough) {
        this.enableStrikethrough = enableStrikethrough;
        return this;
    }

    public LabelTextStyle setEnableItalics(boolean enableItalics) {
        this.enableItalics = enableItalics;
        return this;
    }

    public LabelTextStyle setEnAntiColor(boolean enAntiColor) {
        this.enAntiColor = enAntiColor;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getTextSize() {
        return textSize;
    }

    public int getTextWidthRatio() {
        return textWidthRatio;
    }

    public int getTextHeightRatio() {
        return textHeightRatio;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getAlign() {
        return align;
    }

    public int getRotate() {
        return rotate;
    }

    public int getTextSpace() {
        return textSpace;
    }

    public boolean isEnableBold() {
        return enableBold;
    }

    public boolean isEnableUnderline() {
        return enableUnderline;
    }

    public boolean isEnableStrikethrough() {
        return enableStrikethrough;
    }

    public boolean isEnableItalics() {
        return enableItalics;
    }

    public boolean isEnAntiColor() {
        return enAntiColor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LabelTextStyle{");
        sb.append("posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append(", textSize=").append(textSize);
        sb.append(", textWidthRatio=").append(textWidthRatio);
        sb.append(", textHeightRatio=").append(textHeightRatio);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", align=").append(align);
        sb.append(", rotate=").append(rotate);
        sb.append(", textSpace=").append(textSpace);
        sb.append(", enableBold=").append(enableBold);
        sb.append(", enableUnderline=").append(enableUnderline);
        sb.append(", enableStrikethrough=").append(enableStrikethrough);
        sb.append(", enableItalics=").append(enableItalics);
        sb.append(", enAntiColor=").append(enAntiColor);
        sb.append('}');
        return sb.toString();
    }
}

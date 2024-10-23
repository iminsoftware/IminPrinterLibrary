package com.imin.printer.enums;

/**
 * @author dzm
 * Created by dzm on 2024/5/29.
 */
public enum LabelInfo {
    MODEL,                  //标签型号
    VERSION,                //固件版本号
    HEIGHT,                 //当前打印完的标签的高度
    DENSITY,                //浓度
    SPEED,                  //速度
    MODE,                   //打印机模式
    GAP_OFFSET,             //当前缝隙偏移量
    PRINT_LENGTH,           //历史打印长度
    NO_PAPER_THRESHOLD,     //当前取纸传感器无纸阈值参数
    HAS_PAPER_THRESHOLD,    //当前取纸传感器有纸阈值参数
    THRESHOLD_ADJUSTMENT,   //当前取纸传感器阈值调整参数
    ORIGINAL_STATUS,        //原始状态值
    LABEL_STATUS,           //标签状态
    PAPER_STATUS,           //取纸状态
    HOST_RESULT,            //最后一次HOST下发命令执行结果
    GAP_ERROR               // 获取缝隙机械误差
}

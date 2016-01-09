package com.facade;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   一个三星相机
 */
public class SamsungCamera implements Camera{

    @Override
    public void open() {
        System.out.print("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.print("拍照");
    }

    @Override
    public void close() {
        System.out.print("关闭相机");
    }
}

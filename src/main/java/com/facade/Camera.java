package com.facade;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    拍照片
 */
public interface Camera {

    /**
     * 打开相机
     */
    void open();

    /**
     * 拍照
     */
    void takePicture();

    /**
     * 关闭相机
     */
    void close();
}

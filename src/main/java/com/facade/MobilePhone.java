package com.facade;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   一个智能手机
 */
public class MobilePhone {


    // TODO: 2016/1/9 然而此时这个手机就有了电话和拍照的功能 
    private Phone phone=new PhoneImpl();
    private Camera camera=new SamsungCamera();

    /**
     * 打电话
     */
    public void dail(){
        phone.dail();
    }

    /**
     * 进行视频聊天
     */
    public void vodeoChat(){
        System.out.print("开始进行视频聊天");
        camera.open();
        phone.dail();
    }

    /**
     * 挂断电话
     */
    public void hangup(){
        phone.hangup();
    }

    /**
     * 照片
     */
    public void takePicture(){
        camera.open();
        camera.takePicture();
    }

    /**
     * 关闭拍照功能
     */
    public void CloseCamera(){
        camera.close();
    }
}

package com.mediator.d;

import com.mediator.Mediator;
import com.mediator.d.Colleague;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    cpu
 */
public class CPU extends Colleague {

    private String dataVideo,dataSound;
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     *  获取视频数据
     */
    public String getDataVideo(){
        return dataVideo;
    }

    /**
     * 获取音频
     */
    public String getDataSound(){
        return dataSound;
    }

    /**
     * 对数据解码
     */
    public void decodeData(String data){
        //分割视频和音频
        String []tmp=data.split(",");
        //解析音频和视频
        dataVideo=tmp[0];
        dataSound=tmp[1];

        //告诉中介者自己状态发生了改变
        mediator.change(this);
    }
}

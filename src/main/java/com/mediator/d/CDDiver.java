package com.mediator.d;

import com.mediator.Mediator;
import com.mediator.d.Colleague;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   光驱
 */
public class CDDiver extends Colleague {

    private String data;

    public CDDiver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取视频数据
     */
    public String read(){
        return data;
    }

    /**
     * 加载视频数据
     */
    public void load(){
        data="视频数据  音频数据";
        mediator.change(this);
    }

}

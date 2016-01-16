package com.mediator.d;

import com.mediator.Mediator;
import com.mediator.d.Colleague;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   显卡
 */
public class GraphicsCard  extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data){
        System.out.print("播放视频");
    }

}

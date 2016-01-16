package com.mediator.d;

import com.mediator.Mediator;
import com.mediator.d.Colleague;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    声卡
 */
public class SoundCard extends Colleague {


    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public  void soundPlay(String data){
        System.out.print("播放声音"+data);
    }
}

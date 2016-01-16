package com.mediator.d;

import com.mediator.Mediator;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:  抽象的同事类
 */
public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
}

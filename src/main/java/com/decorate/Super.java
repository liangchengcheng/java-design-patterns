package com.decorate;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Super implements People {

    private People people;

    public Super(People people){
        this.people=people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}

package com.decorate;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class SuperShirt extends Super {

    public SuperShirt(People people) {
        super(people);
    }

    public void wear() {
        super.wear();
        System.out.println("穿个衬衫");
    }
}

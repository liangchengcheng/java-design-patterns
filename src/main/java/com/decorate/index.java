package com.decorate;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    { 装饰模式 }
 */
public class index {

    public  static void main(String [] args){
        People people=new SuperShirt(new Tom());
    }
}

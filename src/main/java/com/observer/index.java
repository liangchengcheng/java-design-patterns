package com.observer;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class index {

    public  static void main(){
        Observer observer=new ConcreteObserver1();
        Subject subject=new Subject();
        subject.register(observer);
        subject.notifys();
        
    }
}

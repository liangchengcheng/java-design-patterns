package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Subject {
    List<Observer> list=new ArrayList<>();

    //注册
    public void register(Observer observer){
        list.add(observer);
    }

    public void notifys(){
        for (Observer observer: list){
            observer.update();
        }
    }
    public void unRegister(Observer observer){
        list.remove(observer);
    }
}

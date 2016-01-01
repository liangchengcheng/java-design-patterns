package com.singleton;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description: 单例模式一般用于对象单一处理，保证了对象的唯一性，方便操作，也可以防止一直初始化对象造成的内存泄露，和一些别的问题
 */
public class Index {
    public static void main(String[] args){
        ThreadManager.getInstance().createLongPool().execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}

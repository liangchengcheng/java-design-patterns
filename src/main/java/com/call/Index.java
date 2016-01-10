package com.call;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Index {

    public static void main(String[] args){

        A a=new A();
        a.register(new CallBack() {
            @Override
            public void oncall() {
                System.out.print("回调函数");
            }
        });
    }
}

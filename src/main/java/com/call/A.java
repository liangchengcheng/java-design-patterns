package com.call;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class A {

    private CallBack callBack;
    //注册一个时间
    public void register(CallBack callBack){
        this.callBack=callBack;
    }

    //需要调用的时候回调
    public void call(){
        callBack.oncall();
    }
}

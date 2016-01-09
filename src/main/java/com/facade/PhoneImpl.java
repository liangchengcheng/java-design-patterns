package com.facade;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   PhoneImpl
 */
public class PhoneImpl implements Phone{

    @Override
    public void dail() {
        System.out.print("拨打电话");
    }

    @Override
    public void hangup() {
        System.out.print("挂断");
    }
}

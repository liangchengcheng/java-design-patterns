package com.builder;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   苹果电脑
 */
public class AppleComputer extends Computer {

    protected  AppleComputer(){

    }
    @Override
    public void setmCpu(int core) {
        mCpuCore=core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize=gb;
    }

    @Override
    public void setmOs(String os) {
        mOs=os;
    }
}

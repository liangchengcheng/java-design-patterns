package com.builder;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    Computer产品抽象类
 */
public abstract class Computer {
    protected int mCpuCore=1;
    protected int mRamSize=0;
    protected String mOs="Dos";

    protected Computer(){

    }

    /**
     * 设置CPU的核心数
     */
    public abstract void setmCpu(int core);

    /**
     * 设置内存
     */
    public abstract void setRAM(int gb);

    /**
     * 设置操作系统
     */
    public abstract void setmOs(String os);
}

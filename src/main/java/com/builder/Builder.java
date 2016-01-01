package com.builder;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:
 */
public abstract class Builder {

    /**
     * 设置CPU的核心数
     */
    public  abstract void buildCPU(int core);

    /**
     * 设置内存
     */
    public abstract void buildRAM(int gb);

    /**
     * 设置操作系统
     */
    public abstract void buildOs(String os);

    /**
     * 创建computer
     */
    public abstract Computer create();
}

package com.builder;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    Director
 */
public class Director{

    Builder mBuilder=null;

    public Director(Builder builder){
        mBuilder=builder;
    }

    /**
     * 构建对象
     */
    public void construct(int cpu,int ram,String os){
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }
}

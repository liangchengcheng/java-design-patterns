package com.builder;

import sun.rmi.runtime.Log;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:
 */
public class MainDemo {
    /**
     *  良好的封装性， 使用建造者模式可以使客户端不必知道产品内部组成的细节；
        建造者独立，容易扩展；
        在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到
     */

    public static void main(String []args){
        //构建器
        Builder builder=new ApplePCBuilder();

        //Director
        Director pcDirector=new Director(builder);

        //开始构建 4核 内存2g mac系统
        pcDirector.construct(4,2,"Mac OS X 11.0.1");

        //构建电脑输出相关信息
        System.out.print(builder.create().toString());
    }
}

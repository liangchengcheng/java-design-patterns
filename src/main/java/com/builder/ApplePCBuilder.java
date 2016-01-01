package com.builder;

import java.util.Map;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:   ApplePCBuilder
 */
public class ApplePCBuilder extends  Builder{

    private Computer mApplePc=new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePc.setmCpu(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePc.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setmOs(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }
}

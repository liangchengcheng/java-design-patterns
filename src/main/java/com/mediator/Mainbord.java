package com.mediator;

import com.mediator.d.CDDiver;
import com.mediator.d.CPU;
import com.mediator.d.Colleague;
import com.mediator.d.GraphicsCard;
import com.mediator.d.SoundCard;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Mainbord extends Mediator {
    /**
     * 光驱
     */
    private CDDiver cdDiver;

    /**
     * cpu
     */
    private CPU cpu;

    /**
     * 声卡
     */
    private SoundCard soundCard;

    /**
     * 显卡
     */
    private GraphicsCard graphicsCard;

    @Override
    public void change(Colleague colleague) {
        if (colleague==cdDiver){

        }
    }

    /**
     * cpu 处理光驱读取的数据
     */
    private void handleCD(CDDiver cdDiver){
        cpu.decodeData(cdDiver.read());
    }

    /**
     * cpu处理了数据之后的交互
     */
    private void handleCPU(CPU cpu){
        //声卡播放spu读取的声音的数据
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataSound());
    }

    /**
     * 设置光驱
     */
    public void setCdDiver(CDDiver cdDiver){
        this.cdDiver=cdDiver;
    }

    /**
     *  设置cpu
     */
    public void setCpu(CPU cpu){
        this.cpu=cpu;
    }

    /**
     * 设置声卡
     */
    public void setSoundCard(SoundCard soundCard){
        this.soundCard=soundCard;
    }

    /**
     * 设置显卡
     */
    public void setGraphicsCard(GraphicsCard graphicsCard){
        this.graphicsCard=graphicsCard;
    }

}

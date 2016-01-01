package com.singleton;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:  ThreadManager
 */
public class ThreadManager {

    /**
     * 私有化构造函数
     */
    private ThreadManager(){}

    /**
     * 静态私有初始化对象
     */
    private static ThreadManager instance=new ThreadManager();
    private ThreadPoolProxy longPool;
    private ThreadPoolProxy shortPool;

    /**
     *返回对象
     */
    public static ThreadManager getInstance(){
        return instance;
    }

    public synchronized ThreadPoolProxy createLongPool(){
        if (shortPool==null){
            shortPool=new ThreadPoolProxy(3,3,5000L);
        }
        return shortPool;
    }

    public class  ThreadPoolProxy{
        private ThreadPoolExecutor pool;
        private int corePoolSize;
        private int maximumPoolSize;
        private long time;

        public  ThreadPoolProxy(int corePoolSize,int maximumPoolSize,long time){
            this.corePoolSize=corePoolSize;
            this.maximumPoolSize=maximumPoolSize;
            this.time=time;
        }

        public  void execute(Runnable runnable){
            if (pool == null){
                pool=new ThreadPoolExecutor(corePoolSize,maximumPoolSize,time, TimeUnit.MICROSECONDS,new LinkedBlockingQueue<>(10));
            }
            pool.execute(runnable);
        }

        public void cancel(Runnable runnable){
            if (pool!=null && !pool.isShutdown()&&pool.isTerminated()){
                pool.remove(runnable);
            }
        }
    }
}

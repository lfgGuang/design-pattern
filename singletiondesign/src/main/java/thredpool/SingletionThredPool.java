package thredpool;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
* @author XA
* date 2021/7/6 8:56
 * description: 单例线程池
*/
public class SingletionThredPool {

    /* 核心线程池大小：线程池维护的最小线程数，即使处于空闲状态也不会销毁。默认1 */
    private static final int CORE_POOL_SIZE = 50;
    /* 线程池最大数量：线程池不会无限制的创建线程，这里是最大容量。默认Integer.MAX_VALUE */
    private static final int MAXIMUNPOOL_SIZE = 1000;
    /* 空闲线程存活时间：一个线程如果处于空闲时间，并且当前线程数量大于核心线程数时，就会被销毁。默认60s */
    private static final int KEEP_ALIVE_TIME = 20;

    private ThreadFactory springThreadFactory = new CustomizableThreadFactory("XA-thread-");


    private ThreadPoolExecutor executor =
            new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUNPOOL_SIZE, KEEP_ALIVE_TIME,
                    TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5), springThreadFactory);

    private static SingletionThredPool instance = null;

    private SingletionThredPool(){};

    public void execute(Runnable runnable){
        executor.execute(runnable);
    }

    public void shutdown(){
        executor.shutdown();
    }

    public static SingletionThredPool getInstance(){
        if(instance == null){
            synchronized (SingletionThredPool.class){
                if(instance == null){
                    instance = new SingletionThredPool();
                }
            }
        }
        return instance;
    }

}

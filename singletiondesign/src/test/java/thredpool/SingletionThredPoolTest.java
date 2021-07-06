package thredpool;

import org.junit.jupiter.api.Test;

public class SingletionThredPoolTest implements Runnable{

    private SingletionThredPoolTest(){

    }

    private SingletionThredPoolTest instance = null;

    private SingletionThredPoolTest getInstance(){
        if(instance == null){
            synchronized (SingletionThredPoolTest.class){
                if(instance == null){
                    instance = new SingletionThredPoolTest();
                }
            }
        }
        return instance;
    }

    @Test
    public void test() {
        long startTime = System.currentTimeMillis();
        for (int i=0;i<1000;i++){
            SingletionThredPool singletionThredPool = SingletionThredPool.getInstance();
            System.out.println("获得的线程实例为：" + singletionThredPool);
            SingletionThredPoolTest singletionThredPoolTest = this.getInstance();
            System.out.println("当前的测试类为：" + singletionThredPoolTest);
            singletionThredPool.execute(singletionThredPoolTest);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime));
    }

    @Override
    public void run() {
//        System.out.println("run: " + Thread.currentThread().getName());
    }
}

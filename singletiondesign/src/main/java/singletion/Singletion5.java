package singletion;
/**
* @author XA
* date 2021/7/6 17:09
 * description: 懒汉式-线程安全-双重检查
*/
public class Singletion5 {

    private static Singletion5 instance;

    private Singletion5(){};

    private static Singletion5 getInstance(){
        if(instance == null){
            synchronized (Singletion5.class){
                if(instance == null){
                    instance = new Singletion5();
                }
            }
        }
        return instance;
    }

}

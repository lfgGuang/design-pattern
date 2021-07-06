package singletion;
/**
* @author XA
* date 2021/7/6 17:03
 * description: 懒汉式线程安全-同步方法
*/
public class Singletion4 {

    private static Singletion4 instance;

    private Singletion4(){};

    public static synchronized Singletion4 getInstance(){
        if(instance == null){
            instance = new Singletion4();
        }
        return instance;
    }

}

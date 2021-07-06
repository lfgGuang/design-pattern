package singletion;
/**
* @author XA
* date 2021/7/6 16:50
 * description: 饿汉式-静态代码块
*/
public class Singletion2 {

    private Singletion2(){};

    private static Singletion2 instance;

    static{
        instance = new Singletion2();
    }

    public Singletion2 getInstance(){
        return instance;
    }

}

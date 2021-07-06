package singletion;
/**
* @author XA
* date 2021/7/6 16:56
 * description: 懒汉式-线程不安全
*/
public class Singletion3 {

    private Singletion3(){};

    private static Singletion3 instance;

    private Singletion3 getInstance(){
        if(instance == null){
            instance = new Singletion3();
        }
        return instance;
    }

}

package singletion;
/**
* @author XA
* date 2021/7/6 16:41
 * description: 饿汉式(静态常量)
*/
public class Singletion1 {

    /* 构造器私有化 */
    private Singletion1(){};
    
    /* 提供静态常量Singletion1,创建实例对象 */
    private static Singletion1 instance = new Singletion1();

    /* 对外的静态公共方法 */
    public static Singletion1 getInstance(){
        return instance;
    }

}

package factory;

import service.SendMsgService;
import service.impl.SendMsgForMobileServiceImpl;

/**
* @author XA
* date 2021/5/27 10:17
 * description: 消息发送工厂类
*/
public class SendMsgFactory {

    /**
     * 功能描述: 消息发送工厂处理类
     * Param: [msgType]
     * Return: service.SendMsgService
     */
    public SendMsgService sendMsgFactory(Integer msgType){
        // 0:手机端消息；1:客户端消息（也可以使用枚举类）
        if(msgType.equals(0)){
            return new SendMsgForMobileServiceImpl();
        }else if(msgType.equals(1)){
            return new SendMsgForMobileServiceImpl();
        }else{
            return null;
        }
    }

}

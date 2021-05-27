package service.impl;

import service.SendMsgService;

/**
* @author XA
* date 2021/5/27 10:14
 * description: 发送手机端消息
*/
public class SendMsgForMobileServiceImpl implements SendMsgService {

    /**
     * 功能描述: 发送手机端消息
     * Param: [msg]
     * Return: void
     */
    @Override
    public void sendMsg(String msg) {
        System.out.println("发送手机端消息：" + msg);
    }
}

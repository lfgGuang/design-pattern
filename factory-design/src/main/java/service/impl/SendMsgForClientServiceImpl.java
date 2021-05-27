package service.impl;

import service.SendMsgService;

/**
* @author XA
* date 2021/5/27 10:16
 * description: 发送客户端消息业务实现类
*/
public class SendMsgForClientServiceImpl implements SendMsgService {

    /**
     * 功能描述: 发送客户端消息
     * Param: [msg]
     * Return: void
     */
    @Override
    public void sendMsg(String msg) {
        System.out.println("发送客户端消息：" + msg);
    }
}

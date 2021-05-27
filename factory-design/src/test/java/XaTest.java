import factory.SendMsgFactory;
import org.junit.jupiter.api.Test;
import service.SendMsgService;

public class XaTest {

    @Test
    public void xaTest(){
        SendMsgFactory sendMsgFactory = new SendMsgFactory();
        /* 模拟手机消息发送 */
        SendMsgService sendMsgServiceForMobile = sendMsgFactory.sendMsgFactory(0);
        sendMsgServiceForMobile.sendMsg("这是一个手机消息...");

        /* 模拟客户端消息发送 */
        SendMsgService sendMsgServiceFoeClient = sendMsgFactory.sendMsgFactory(1);
        sendMsgServiceFoeClient.sendMsg("这是一个客户端消息...");
    }

}

package mao.example.DesignPatterns.factory.simpleFactory;

import java.util.HashMap;
import java.util.Map;

public class PayFactory {
    private static Map<String,Pay> map = null;
    static {
        map = new HashMap<>();
        map.put("ali",new Alipay());
        map.put("wechat",new WeChatpay());
        map.put("overseas",new WeChatpay());
        map.put("union",new WeChatpay());

    }
    public static Pay getPayParttem(String courseKey){
        return map.get(courseKey);
    }


}

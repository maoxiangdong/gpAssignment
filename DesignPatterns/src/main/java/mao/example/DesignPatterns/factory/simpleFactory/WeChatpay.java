package mao.example.DesignPatterns.factory.simpleFactory;

public class WeChatpay implements Pay {
    @Override
    public void pay() {
        System.out.println("===微信支付====");
    }
}

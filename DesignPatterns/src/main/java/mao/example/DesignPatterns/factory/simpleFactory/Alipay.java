package mao.example.DesignPatterns.factory.simpleFactory;

public class Alipay implements Pay {
    @Override
    public void pay() {
        System.out.println("===支付宝支付====");
    }
}

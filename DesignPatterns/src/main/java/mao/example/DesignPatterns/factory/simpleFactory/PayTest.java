package mao.example.DesignPatterns.factory.simpleFactory;

public class PayTest {
    public static void main(String[] args) throws Exception {
        String key = "wechat";
        Pay pay = PayFactory.getPayParttem(key);
        pay.pay();
    }

}

package mao.example.DesignPatterns.factory.simpleFactory;

public class UnionPay implements Pay {
    @Override
    public void pay() {
        System.out.println("===银联支付====");
    }
}

package mao.example.DesignPatterns.factory.simpleFactory;

public class OverseasPay implements Pay {
    @Override
    public void pay() {
        System.out.println("===境外支付====");
    }
}

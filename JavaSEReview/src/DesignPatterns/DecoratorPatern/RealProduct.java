package DesignPatterns.DecoratorPatern;

/**
 * 真实产品类
 */
public class RealProduct implements Product{
    @Override
    public void createProduct() {
        System.out.println("创造装饰着产品");
    }
}

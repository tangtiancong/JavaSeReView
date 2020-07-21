package DesignPatterns.FactoryPattern;

public class RobitFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("机器人工厂创建");
        return new RobitProductImpl();
    }
}

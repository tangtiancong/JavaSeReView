package DesignPatterns.FactoryPattern;

/**
 *机器工厂实现类
 */
public class RobitFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("机器人工厂创建");
        return new RobitProductImpl();
    }
}

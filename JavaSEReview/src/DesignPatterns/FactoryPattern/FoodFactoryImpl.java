package DesignPatterns.FactoryPattern;

/**
 * 食物工厂实现类
 */
public class FoodFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("食品工厂创建");
        return new FoodProductImpl();
    }
}

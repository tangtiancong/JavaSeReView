package DesignPatterns.FactoryPattern;

public class FoodFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("食品工厂创建");
        return new FoodProductImpl();
    }
}

package DesignPatterns.FactoryPattern;

public class FoodFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("ʳƷ��������");
        return new FoodProductImpl();
    }
}

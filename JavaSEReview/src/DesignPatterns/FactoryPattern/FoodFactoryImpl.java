package DesignPatterns.FactoryPattern;

/**
 * ʳ�﹤��ʵ����
 */
public class FoodFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("ʳƷ��������");
        return new FoodProductImpl();
    }
}

package DesignPatterns.FactoryPattern;

/**
 *��������ʵ����
 */
public class RobitFactoryImpl implements FactoryInterFace{
    @Override
    public ProductInterFace createProduct() {
        System.out.println("�����˹�������");
        return new RobitProductImpl();
    }
}

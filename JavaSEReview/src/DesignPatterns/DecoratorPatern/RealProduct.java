package DesignPatterns.DecoratorPatern;

/**
 * ��ʵ��Ʒ��
 */
public class RealProduct implements Product{
    @Override
    public void createProduct() {
        System.out.println("����װ���Ų�Ʒ");
    }
}

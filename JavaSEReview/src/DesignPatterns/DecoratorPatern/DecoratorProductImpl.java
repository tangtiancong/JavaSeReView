package DesignPatterns.DecoratorPatern;

/**
 * ����װ����
 */
public class DecoratorProductImpl extends  DecoratorProduct{
    DecoratorProductImpl(Product product) {
        super(product);
    }

    @Override
    public void createProduct() {
        super.createProduct();
        decoratorMethod();

    }
    public void decoratorMethod(){
        System.out.println("װ�η�����");
    }
}

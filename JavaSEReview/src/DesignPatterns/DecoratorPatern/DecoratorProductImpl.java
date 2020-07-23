package DesignPatterns.DecoratorPatern;

/**
 * 具体装饰者
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
        System.out.println("装饰方法：");
    }
}

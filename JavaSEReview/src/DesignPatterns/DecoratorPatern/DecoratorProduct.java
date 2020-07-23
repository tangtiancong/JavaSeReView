package DesignPatterns.DecoratorPatern;

/**
 * ����װ����
 */
public class DecoratorProduct implements  Product{
    Product product;
    DecoratorProduct(Product product){
        this.product=product;
    }
    @Override
    public void createProduct() {
        product.createProduct();
    }
}

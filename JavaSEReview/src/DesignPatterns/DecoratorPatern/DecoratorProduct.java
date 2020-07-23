package DesignPatterns.DecoratorPatern;

/**
 * ³éÏó×°ÊÎÕß
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

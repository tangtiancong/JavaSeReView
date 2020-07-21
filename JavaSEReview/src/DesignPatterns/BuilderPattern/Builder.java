package DesignPatterns.BuilderPattern;

/**
 * 抽象创建者(包含产品者)
 */
abstract class Builder {
    Product product=new Product();
    public abstract  void buildPartA();
    public abstract  void buildPartB();
    public abstract  void buildPartC();
    public Product getProduct(){
        return product;
    }
}

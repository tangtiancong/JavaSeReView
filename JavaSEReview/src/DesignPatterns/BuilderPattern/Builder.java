package DesignPatterns.BuilderPattern;

/**
 * ���󴴽���(������Ʒ��)
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

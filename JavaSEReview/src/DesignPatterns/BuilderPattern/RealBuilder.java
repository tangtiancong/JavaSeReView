package DesignPatterns.BuilderPattern;

/**
 * @author tangtiancong
 * 真实创建者
 */
public class RealBuilder extends Builder{
    @Override
    public void buildPartA(){
        product.setPartA("A部分创建");
    }
    @Override
    public void buildPartB(){
        product.setPartB("B部分创建");
    }
    @Override
    public void buildPartC(){
        product.setPartC("C部分创建");
    }
}

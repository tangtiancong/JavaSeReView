package DesignPatterns.BuilderPattern;


/**
 * 指挥者（包含抽象创造者）
 */
public class Conductor {
    private Builder builder;
    Conductor(Builder builder){
        this.builder=builder;
    }
    //创建所有部件
    public Product createAllProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}

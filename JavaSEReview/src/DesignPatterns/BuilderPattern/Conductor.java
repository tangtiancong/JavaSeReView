package DesignPatterns.BuilderPattern;


/**
 * ָ���ߣ������������ߣ�
 */
public class Conductor {
    private Builder builder;
    Conductor(Builder builder){
        this.builder=builder;
    }
    //�������в���
    public Product createAllProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}

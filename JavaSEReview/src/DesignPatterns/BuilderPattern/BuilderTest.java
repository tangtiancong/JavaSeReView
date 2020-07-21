package DesignPatterns.BuilderPattern;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder=new RealBuilder();
        Conductor conductor=new Conductor(builder);
        Product product=conductor.createAllProduct();
        product.show();

    }
}

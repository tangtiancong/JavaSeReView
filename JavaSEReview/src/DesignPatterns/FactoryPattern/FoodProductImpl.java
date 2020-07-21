package DesignPatterns.FactoryPattern;

public class FoodProductImpl implements ProductInterFace{
    @Override
    public void show() {
        System.out.println("食品产品生成");
    }
}

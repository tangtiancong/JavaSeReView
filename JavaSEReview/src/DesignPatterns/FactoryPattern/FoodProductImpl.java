package DesignPatterns.FactoryPattern;

/**
 * 食品工厂实现类
 */
public class FoodProductImpl implements ProductInterFace{
    @Override
    public void show() {
        System.out.println("食品产品生成");
    }
}

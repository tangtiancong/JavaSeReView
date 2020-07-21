package DesignPatterns.FactoryPattern;

public class RobitProductImpl implements ProductInterFace{
    @Override
    public void show() {
        System.out.println("机器人产品生成");
    }
}

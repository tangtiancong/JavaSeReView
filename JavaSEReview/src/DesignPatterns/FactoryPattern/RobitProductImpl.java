package DesignPatterns.FactoryPattern;

/**
 * 机器产品实现类
 */
public class RobitProductImpl implements ProductInterFace{
    @Override
    public void show() {
        System.out.println("机器人产品生成");
    }
}

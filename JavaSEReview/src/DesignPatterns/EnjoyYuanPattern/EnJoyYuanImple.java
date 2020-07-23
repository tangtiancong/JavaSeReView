package DesignPatterns.EnjoyYuanPattern;

/**
 * 享元实现类
 */
public class EnJoyYuanImple implements EnjoyYuanInterFace{
    private String key;
    public EnJoyYuanImple(String key) {
        this.key = key;
        System.out.println("创建对象"+key);
    }
    @Override
    public void output(NotEnjoy notEnjoy) {
        System.out.println("享元模式："+key);
        System.out.println("获取的非享元类消息"+notEnjoy.getInfo());
    }
}

package DesignPatterns.PrototypeFactory;

/**
 * 原型工厂模式
 * 抽象原型类：Cloneable
 * 具体原型类:PrototypeFactory
 * 访问类PrototypeFactory.main
 */

public class PrototypeFactory implements Cloneable{
    PrototypeFactory(){ }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (PrototypeFactory)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeFactory prototypeFactory=new PrototypeFactory();
        PrototypeFactory prototypeFactory1= (PrototypeFactory) prototypeFactory.clone();
        System.out.println("prototypeFactory==prototypeFactory1 ?"+(prototypeFactory==prototypeFactory1));
    }
}

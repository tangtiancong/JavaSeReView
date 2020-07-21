package DesignPatterns.PrototypeFactory;

/**
 * ԭ�͹���ģʽ
 * ����ԭ���ࣺCloneable
 * ����ԭ����:PrototypeFactory
 * ������PrototypeFactory.main
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

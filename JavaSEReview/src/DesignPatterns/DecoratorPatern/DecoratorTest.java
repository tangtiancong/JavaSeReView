package DesignPatterns.DecoratorPatern;

/**
 * װ����ģʽ
 * ���󹹼���Component����ɫ������һ������ӿ��Թ淶׼�����ո������εĶ���
 * ���幹����Concrete    Component����ɫ��ʵ�ֳ��󹹼���ͨ��װ�ν�ɫΪ�����һЩְ��
 * ����װ�Σ�Decorator����ɫ���̳г��󹹼������������幹����ʵ��������ͨ����������չ���幹���Ĺ��ܡ�
 * ����װ�Σ�ConcreteDecorator����ɫ��ʵ�ֳ���װ�ε���ط������������幹��������Ӹ��ӵ����Ρ�
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Product product=new RealProduct();
        DecoratorProduct decoratorProduct=new DecoratorProductImpl(product);
        decoratorProduct.createProduct();
    }
}

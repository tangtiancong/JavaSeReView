package DesignPatterns.FactoryPattern;

/**
 * һ������ģʽ��
 * ���󹤳���Abstract Factory�����ṩ�˴�����Ʒ�Ľӿڣ�������ͨ�������ʾ��幤���Ĺ������� createProduct() ��������Ʒ
 * ���幤����ConcreteFactory����Ҫ��ʵ�ֳ��󹤳��еĳ��󷽷�����ɾ����Ʒ�Ĵ���
 *�����Ʒ��Product���������˲�Ʒ�Ĺ淶�������˲�Ʒ����Ҫ���Ժ͹���
 * �����Ʒ��ConcreteProduct����ʵ���˳����Ʒ��ɫ������Ľӿڣ��ɾ��幤������������ͬ���幤��֮��һһ��Ӧ��
 * �������󹤳�ģʽ
 * һ���������Դ��������Ʒ�������󹤳�������������������
 *
 */
public class FactoryTest {
    public static void main(String[] args) {
        FactoryInterFace robitFactory=new RobitFactoryImpl();
        robitFactory.createProduct().show();
        FactoryInterFace foodFactory=new FoodFactoryImpl();
        foodFactory.createProduct().show();
    }

}

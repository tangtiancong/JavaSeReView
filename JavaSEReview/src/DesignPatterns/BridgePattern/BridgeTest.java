package DesignPatterns.BridgePattern;

/**
 * �Ž�ģʽ
 *���󻯣�Abstraction����ɫ����������࣬������һ����ʵ�ֻ���������á�
 * ��չ���󻯣�Refined    Abstraction����ɫ���ǳ��󻯽�ɫ�����࣬ʵ�ָ����е�ҵ�񷽷�����ͨ����Ϲ�ϵ����ʵ�ֻ���ɫ�е�ҵ�񷽷���
 * ʵ�ֻ���Implementor����ɫ������ʵ�ֻ���ɫ�Ľӿڣ�����չ���󻯽�ɫ���á�
 * ����ʵ�ֻ���Concrete Implementor����ɫ������ʵ�ֻ���ɫ�ӿڵľ���ʵ�֡�
 */
public class BridgeTest {
    public static void main(String[] args) {
        ColorInter color=new ColorImpl("��ɫ");
        AbstractWllet absTractWallet=new AbsTractWalletImpl(color);
        absTractWallet.getWallet();
    }
}

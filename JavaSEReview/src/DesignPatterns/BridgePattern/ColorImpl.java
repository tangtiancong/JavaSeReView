package DesignPatterns.BridgePattern;

/**
 * ����ʵ�ֻ���ɫ
 */
public class ColorImpl implements  ColorInter {
    private  String s;

    public ColorImpl(String s) {
        this.s = s;
    }

    @Override
    public void getcolor() {
        System.out.println("��ɫ"+s);
    }
}

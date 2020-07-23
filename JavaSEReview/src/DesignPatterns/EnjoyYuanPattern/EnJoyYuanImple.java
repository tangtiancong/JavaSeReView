package DesignPatterns.EnjoyYuanPattern;

/**
 * ��Ԫʵ����
 */
public class EnJoyYuanImple implements EnjoyYuanInterFace{
    private String key;
    public EnJoyYuanImple(String key) {
        this.key = key;
        System.out.println("��������"+key);
    }
    @Override
    public void output(NotEnjoy notEnjoy) {
        System.out.println("��Ԫģʽ��"+key);
        System.out.println("��ȡ�ķ���Ԫ����Ϣ"+notEnjoy.getInfo());
    }
}

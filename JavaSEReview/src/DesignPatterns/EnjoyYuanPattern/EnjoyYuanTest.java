package DesignPatterns.EnjoyYuanPattern;

/**
 * ������Ԫ��ɫ����:�����еľ�����Ԫ��Ļ��࣬Ϊ������Ԫ�淶��Ҫʵ�ֵĹ����ӿڣ�����Ԫ���ⲿ״̬�Բ�������ʽͨ���������롣
 * ������Ԫ�� ����ɫ��ʵ�ֳ�����Ԫ��ɫ�����涨�Ľӿڡ�
 * ����Ԫ�� )��ɫ���ǲ����Թ�����ⲿ״̬�����Բ�������ʽע�������Ԫ����ط����С�
 * ��Ԫ������ ����ɫ�����𴴽��͹�����Ԫ��ɫ�����ͻ���������һ����Ԫ����ʱ����Ԫ�������ϵͳ���Ƿ���ڷ���Ҫ�����Ԫ��������������ṩ���ͻ�����������ڵĻ����򴴽�һ���µ���Ԫ����
 */
public class EnjoyYuanTest {
    public static void main(String[] args) {
        EnjoyYuanFactory factory=new EnjoyYuanFactory();
        EnJoyYuanImple enJoyYuanImple= (EnJoyYuanImple) factory.getEnjoyImple("a1");
        factory.getEnjoyImple("a2");
        factory.getEnjoyImple("a1");
        NotEnjoy notEnjoy=new NotEnjoy("not enjoy");
        enJoyYuanImple.output(notEnjoy);
    }
}

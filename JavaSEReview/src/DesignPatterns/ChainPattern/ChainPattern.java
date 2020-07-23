package DesignPatterns.ChainPattern;


import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

public class ChainPattern {
    public static void main(String[] args) {
        Handler handler1=new HandClass1();
        Handler handler2=new HandClass2();
        handler1.setHandler(handler2);
        handler1.deal("two");
    }
}
/**
 * //�������߽�ɫ
 */
abstract  class Handler{
    Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void deal(String role) {

    }
}
/**
 * //���崦���߽�ɫ1
 */
class HandClass1 extends Handler{
    @Override
    public void deal(String role) {
        System.out.println("�Ƿ���Ҫ��ɫһ����");
        if("one".equals(role)){
            System.out.println("ʹ�ý�ɫһ����");
        }else {
            System.out.println("����Ҫ��ɫһ����");
            if(getHandler()!=null){
                getHandler().deal(role);
            }
        }
    }
}
/**
 * //���崦���߽�ɫ2
 */
class HandClass2 extends Handler{
    @Override
    public void deal(String role) {
        System.out.println("�Ƿ���Ҫ��ɫ������");
        if("two".equals(role)){
            System.out.println("ʹ�ý�ɫ������");
        }else {
            System.out.println("����Ҫ��ɫ������");
            if(getHandler()!=null){
                getHandler().deal(role);
            }
        }
    }
}

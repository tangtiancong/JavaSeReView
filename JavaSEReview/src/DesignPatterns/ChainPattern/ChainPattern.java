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
 * //抽象处理者角色
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
 * //具体处理者角色1
 */
class HandClass1 extends Handler{
    @Override
    public void deal(String role) {
        System.out.println("是否需要角色一处理");
        if("one".equals(role)){
            System.out.println("使用角色一处理");
        }else {
            System.out.println("不需要角色一处理");
            if(getHandler()!=null){
                getHandler().deal(role);
            }
        }
    }
}
/**
 * //具体处理者角色2
 */
class HandClass2 extends Handler{
    @Override
    public void deal(String role) {
        System.out.println("是否需要角色二处理");
        if("two".equals(role)){
            System.out.println("使用角色二处理");
        }else {
            System.out.println("不需要角色二处理");
            if(getHandler()!=null){
                getHandler().deal(role);
            }
        }
    }
}

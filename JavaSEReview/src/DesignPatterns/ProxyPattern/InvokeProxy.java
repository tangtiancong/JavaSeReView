package DesignPatterns.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvokeProxy implements InvocationHandler {
    Object  realProduct;
    InvokeProxy(Object realProduct){
        this.realProduct=realProduct;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ǰ�ü�ǿ");
        Object invoke=method.invoke(realProduct,args);
        System.out.println("���ü�ǿ");
        return invoke;
    }
}

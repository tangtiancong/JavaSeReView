package DesignPatterns.ProxyPattern;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
          //��̬����
//        ProxyProduct proxyProduct=new ProxyProduct();
//        proxyProduct.doIt();
          //��̬����
          ProductInterFace productInterFace=new RealProduct();
          InvokeProxy proxy=new InvokeProxy(productInterFace);
          ProductInterFace productInterFace1= (ProductInterFace) Proxy.newProxyInstance(productInterFace.getClass().getClassLoader(),productInterFace.getClass().getInterfaces(),proxy);
          productInterFace1.doIt();
    }
}

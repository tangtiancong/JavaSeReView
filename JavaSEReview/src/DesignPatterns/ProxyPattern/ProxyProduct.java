package DesignPatterns.ProxyPattern;

public class ProxyProduct implements ProductInterFace{
    RealProduct realProduct=null;
    @Override
    public void doIt() {
        if(realProduct==null){
            realProduct=new RealProduct();
        }
        System.out.println("前置加强");
        realProduct.doIt();
        System.out.println("后置加强");
    }
}

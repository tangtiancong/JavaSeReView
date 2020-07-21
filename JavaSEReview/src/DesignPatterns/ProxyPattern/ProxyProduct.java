package DesignPatterns.ProxyPattern;

public class ProxyProduct implements ProductInterFace{
    RealProduct realProduct=null;
    @Override
    public void doIt() {
        if(realProduct==null){
            realProduct=new RealProduct();
        }
        System.out.println("ǰ�ü�ǿ");
        realProduct.doIt();
        System.out.println("���ü�ǿ");
    }
}

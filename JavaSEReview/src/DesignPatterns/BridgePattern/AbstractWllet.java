package DesignPatterns.BridgePattern;

/**
 * ���󻯽�ɫ
 */
public abstract class AbstractWllet {
    ColorInter color=null;
    AbstractWllet(ColorInter color){
        this.color=color;
    }
    //������
    public void getWallet(){};
}

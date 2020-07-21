package DesignPatterns.BridgePattern;

/**
 * 抽象化角色
 */
public abstract class AbstractWllet {
    ColorInter color=null;
    AbstractWllet(ColorInter color){
        this.color=color;
    }
    //包种类
    public void getWallet(){};
}

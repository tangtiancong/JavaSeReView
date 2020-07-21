package DesignPatterns.BridgePattern;

import javax.annotation.Resource;

/**
 * 扩展抽象化角色
 */
public class AbsTractWalletImpl extends AbstractWllet{
    AbsTractWalletImpl(ColorInter color) {
        super(color);
    }
    @Override
    public void getWallet(){
       color.getcolor();
       System.out.println("钱包");
    };
}

package DesignPatterns.BridgePattern;

import javax.annotation.Resource;

/**
 * ��չ���󻯽�ɫ
 */
public class AbsTractWalletImpl extends AbstractWllet{
    AbsTractWalletImpl(ColorInter color) {
        super(color);
    }
    @Override
    public void getWallet(){
       color.getcolor();
       System.out.println("Ǯ��");
    };
}

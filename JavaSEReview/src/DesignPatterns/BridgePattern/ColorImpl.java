package DesignPatterns.BridgePattern;

/**
 * 具体实现化角色
 */
public class ColorImpl implements  ColorInter {
    private  String s;

    public ColorImpl(String s) {
        this.s = s;
    }

    @Override
    public void getcolor() {
        System.out.println("颜色"+s);
    }
}

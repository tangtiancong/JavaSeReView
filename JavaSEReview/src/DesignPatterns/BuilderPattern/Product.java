package DesignPatterns.BuilderPattern;

/**
 * 产品类
 */
public class Product {
    String partA;
    String partB;
    String partC;

    public void setPartA(String partA) {
        this.partA = partA;
        System.out.println("partA创建成功");
    }

    public void setPartB(String partB) {
        this.partB = partB;
        System.out.println("partB创建成功");
    }

    public void setPartC(String partC) {
        this.partC = partC;
        System.out.println("partC创建成功");
    }
    public void show(){
        System.out.println(partA+" "+partB+" "+partC);
    }
}

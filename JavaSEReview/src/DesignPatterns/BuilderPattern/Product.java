package DesignPatterns.BuilderPattern;

/**
 * ��Ʒ��
 */
public class Product {
    String partA;
    String partB;
    String partC;

    public void setPartA(String partA) {
        this.partA = partA;
        System.out.println("partA�����ɹ�");
    }

    public void setPartB(String partB) {
        this.partB = partB;
        System.out.println("partB�����ɹ�");
    }

    public void setPartC(String partC) {
        this.partC = partC;
        System.out.println("partC�����ɹ�");
    }
    public void show(){
        System.out.println(partA+" "+partB+" "+partC);
    }
}

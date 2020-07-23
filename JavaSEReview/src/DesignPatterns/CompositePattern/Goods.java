package DesignPatterns.CompositePattern;

import java.math.BigDecimal;

public class Goods implements BuyInterFace{
    private String name;
    private BigDecimal price;
    private int number;

    public Goods(String name, BigDecimal price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
    public void buy(String name ){
        charging();
    }

    @Override
    public BigDecimal charging() {
        return (BigDecimal) price.multiply(new BigDecimal(number));
    }

    @Override
    public void desc() {

    }
}

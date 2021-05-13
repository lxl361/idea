package com.sinosoft.SE;
//水果披萨
public class FruitPizza extends Pizza{
    private String fruit;//配料

    public FruitPizza() {
    }

    public FruitPizza(String name, int price, int size, String fruit) {
        super(name, price, size);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    void show() {
        System.out.println("披萨的名字:"+this.getName());
        System.out.println("披萨的价格:"+this.getPrice());
        System.out.println("披萨的大小:"+this.getSize());
        System.out.println("披萨的配料:"+this.getFruit());
    }
}

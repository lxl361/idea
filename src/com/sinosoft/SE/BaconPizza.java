package com.sinosoft.SE;
//培根披萨
public class BaconPizza extends Pizza{
    private int weigh;//克数

    public BaconPizza() {
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigth(int weigh) {
        this.weigh = weigh;
    }

    public BaconPizza(String name, int price, int size, int weigh) {
        super(name, price, size);
        this.weigh = weigh;
    }

    @Override
    void show() {
        System.out.println("披萨的名字:"+this.getName());
        System.out.println("披萨的价格:"+this.getPrice());
        System.out.println("披萨的大小:"+this.getSize());
        System.out.println("披萨的克数:"+this.getWeigh());
    }
}

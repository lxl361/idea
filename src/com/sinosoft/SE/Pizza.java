package com.sinosoft.SE;

public abstract class Pizza {
    private String name;
    private int price;
    private int size;
    abstract void show();

    public Pizza() {
    }

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

package com.sinosoft.SE;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要购买的披萨：1.培根披萨  2.水果披萨");
        int num = sc.nextInt();
        Pizza pizza = Factory.getPizza(num);
        pizza.show();
        sc.close();
    }
}

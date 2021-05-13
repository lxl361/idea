package com.sinosoft.SE;

import java.util.Scanner;

//工厂生产pizza
public class Factory {
    public static Pizza getPizza(int num){
        Scanner sc = new Scanner(System.in);
        Pizza p=null;
        switch (num){
            case 1: {
                System.out.println("请录入披萨的价格:");
                int price = sc.nextInt();
                System.out.println("请录入披萨的大小:");
                int size = sc.nextInt();
                System.out.println("请录入培根克数:");
                int weight = sc.nextInt();
                //将录入的信息封装为对象
                BaconPizza bp = new BaconPizza("培根披萨",price,size,weight);
                p=bp;
            }
            break;
            case 2: {
                System.out.println("请录入需要的配料:");
                String fruit = sc.next();
                System.out.println("请录入披萨的大小:");
                int size = sc.nextInt();
                System.out.println("请录入披萨的价格:");
                int price= sc.nextInt();
                //将录入的信息封装为对象
                FruitPizza fp = new FruitPizza("水果披萨",price,size,fruit);
                p=fp;
            }
            break;
        }
        return p;
    }
}

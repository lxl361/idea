package com.sinosoft.collection;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aaa");
        //ml.add("bbb");
        int count = ml.getCount(ml);
        System.out.println(count);
    }
}

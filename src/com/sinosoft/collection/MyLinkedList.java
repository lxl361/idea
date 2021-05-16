package com.sinosoft.collection;

public class MyLinkedList {
    //首节点
    Node first;
    //尾结点
    Node last;
    //计数器
    int count=0;

    public MyLinkedList() {
    }
    //添加元素的方法
    public void add(Object obj){
        //添加的是第一个结点
        if (first == null) {
            //将添加的元素封装为一个Node对象
            Node n = new Node();
            n.setPre(null);
            n.setData(obj);
            n.setNext(null);
            //将首尾结点置成n
            first=n;
            last=n;
        }else {
                //添加的元素不是第一个元素
                Node node = new Node();
                node.setPre(last);//node的上一个结点一定是当前链中的最后一个结点last
                node.setData(obj);
                node.setNext(null);
                last.setNext(node);
                last=node;//将最后一个结点变成node
            }
        //链表中元素数量加一
        count++;
    }

    //得到集合中元素的数量
    public int getCount(MyLinkedList myLinkedList){
        if (first == last) {
            return 1;
        }else {
            return count;
        }
    }
}

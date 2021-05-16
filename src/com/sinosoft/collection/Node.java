package com.sinosoft.collection;

//模拟LinkedList
public class Node {
    private Node pre;
    private Object data;
    private Node next;

    public Node() {
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}

package com.sinosoft.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList col = new ArrayList<>();
        col.add(11);
        col.add(12);
        col.add(13);
        col.add(14);
        System.out.println("-----Iterator----");
        Iterator<Integer> it = col.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package com.sinosoft.Date;
public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        //增加
        sb.append("www");
        System.out.println(sb);
        //修改---插入
        sb.insert(3,"s");
        System.out.println(sb);
        //删除
        /*sb.deleteCharAt(4);
        System.out.println(sb);*/
        sb.delete(4,6);
        System.out.println(sb);

        //查
        char c = sb.charAt(3);
        System.out.println(c);
    }
}

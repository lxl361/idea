package com.sinosoft.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查看的日期:例如 2021-05-09");
        String date = sc.next();
        //string--->calander
        //string--->date
        java.sql.Date d=java.sql.Date.valueOf(date);
        //date-->calendar
        Calendar cal=new GregorianCalendar();
        cal.setTime(d);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //获取本月的最大天数
        int max = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日
        int nowDay = cal.get(Calendar.DATE);
        //日期调整为本月一号
        cal.set(Calendar.DATE,1);
        //一号是星期几
        int weekDay = cal.get(Calendar.DAY_OF_WEEK);
        //一号前面的空格数
        int space=weekDay-1;
        //在日期前面将空格打印出来
        for (int i = 0; i <space ; i++) {
            System.out.print("\t");
        }
        //计数器
        int count=space;
        for (int i = 1; i <=max ; i++) {
            if (i == nowDay) {
                System.out.print(i+"*"+"\t");
            }else {
                System.out.print(i+"\t");
            }
            count++;
            if (count %7==0) {
                System.out.println();
            }
        }
    }
}

package com.machi.daily.jdk;


import java.util.ArrayList;
import java.util.List;

public class ArrayLIstDemo {

    public static void main(String[] args) throws Exception{
        List list = new ArrayList();
        list.add("test");
        Object[] objects = list.toArray();
    }
}

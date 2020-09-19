package com.machi.daily.jdk;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E> {

    //定义底层的数据结构
    transient Object[] elementData;

    //list大小
    private int size;

    //定义默认大小
    private static final int DEFAULT_CAPACITY = 10;

    //构造函数
    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int initCapacity) {
        this.elementData = new Object[initCapacity];
    }

    public boolean add(E element){
        //检查是否需要扩容
        elementData[size++] = element;
        return true;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

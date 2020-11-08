package com.machi.daily.bingfa.wait;

import java.util.LinkedList;

/**
 * 自定义队列，完成入队列和出队列的操作
 */
public class MyQueue {

    private static final int MAX_SIZE = 100;

    private LinkedList<String> queue = new LinkedList<>();

    //入队列
    public synchronized void offer(String element){
        try {
            if (queue.size() == MAX_SIZE){
                wait();
            }
            queue.addLast(element);
            notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //出队列
    public synchronized String take(){
        String element = null;
        try {
            if (queue.size() == 0)
                wait();
            element = queue.removeFirst();
            // 唤醒当前在等待这个锁的那些线程
            notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }
}

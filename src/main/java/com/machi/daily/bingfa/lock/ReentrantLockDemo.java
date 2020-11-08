package com.machi.daily.bingfa.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLockDemo 实现线程安全
 */
public class ReentrantLockDemo {

    static int data = 0;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    lock.lock();
                    data++;
                    System.out.println(data);
                    lock.unlock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    lock.lock();
                    data++;
                    System.out.println(data);
                    lock.unlock();
                }
            }
        }).start();

    }
}

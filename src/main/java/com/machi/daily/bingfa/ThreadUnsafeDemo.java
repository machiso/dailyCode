package com.machi.daily.bingfa;

/**
 * 并发安全问题
 * 共享变量
 * 解决办法：
 * synchronized (ThreadUnsafeDemo.class){
 *        data++;
 *     }
 */
public class ThreadUnsafeDemo {
    public static int data = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    data++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    data++;
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(data);
    }
}

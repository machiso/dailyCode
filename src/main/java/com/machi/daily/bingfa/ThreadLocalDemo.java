package com.machi.daily.bingfa;


public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadLocal<Long> threadLocal = new ThreadLocal<>();

        new Thread(){
            @Override
            public void run() {
                threadLocal.set(1l);
                System.out.println("线程1:"+threadLocal.get());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                threadLocal.set(2l);
                System.out.println("线程2:"+threadLocal.get());
            }
        }.start();
    }

}

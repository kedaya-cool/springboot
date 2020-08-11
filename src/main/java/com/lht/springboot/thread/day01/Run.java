package com.lht.springboot.thread.day01;

/**
 * @ClassName; Run
 * @author: lihantao
 * @Description:
 * @date: 2020/8/11
 */
public class Run {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("hello");
//
//        MyRunnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//        System.out.println("运行结束");
        testSyn();
    }

    private static void testSyn() {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}

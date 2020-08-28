package com.lht.springboot.thread.day02;

/**
 * @ClassName; Run
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        System.out.println("thread1 begin time:" + System.currentTimeMillis());
        thread1.run();
        System.out.println("thread1 end time:" + System.currentTimeMillis());

        MyThread thread2 = new MyThread();
        System.out.println("thread2 begin time:" + System.currentTimeMillis());
        thread2.start();
        System.out.println("thread2 end time:" + System.currentTimeMillis());
    }
}

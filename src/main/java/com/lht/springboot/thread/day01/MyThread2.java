package com.lht.springboot.thread.day01;

/**
 * @ClassName; MyThread2
 * @author: lihantao
 * @Description:
 * @date: 2020/8/11
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("run执行的线程Thread.currentThread:" + Thread.currentThread().getName());
        System.out.println("this.getName ===" + this.getName());
    }

    public MyThread2() {
        super();
        System.out.println("构造方法执行的线程Thread.currentThread:" + Thread.currentThread().getName());
        System.out.println("this.getName ===" + this.getName());

    }
}

package com.lht.springboot.thread.day01;

/**
 * @ClassName; MyThread
 * @author: lihantao
 * @Description:
 * @date: 2020/8/11
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        this.setName(name);
    }

    public MyThread() {
        super();
    }

    private int count = 5;
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("---name: "+ this.currentThread().getName() + " -- count:" + count);
    }
}
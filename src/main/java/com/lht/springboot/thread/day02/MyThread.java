package com.lht.springboot.thread.day02;

/**
 * @ClassName; MyThread
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class MyThread extends Thread {

    @Override
    public void run() {


        try {
            System.out.println("run threadName:" + Thread.currentThread().getName() + "  begin: " +System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName:" + Thread.currentThread().getName() + "  end: " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

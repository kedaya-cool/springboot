package com.lht.springboot.thread.day01;

/**
 * @ClassName; MyRunnable
 * @author: lihantao
 * @Description:
 * @date: 2020/8/11
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("运行中！！！");
    }
}

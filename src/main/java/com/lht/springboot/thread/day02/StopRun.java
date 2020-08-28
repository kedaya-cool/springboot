package com.lht.springboot.thread.day02;

/**
 * @ClassName; StopRun
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class StopRun {

    public static void main(String[] args) throws InterruptedException {
        StopThread thread = new StopThread();
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}

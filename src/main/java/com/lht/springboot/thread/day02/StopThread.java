package com.lht.springboot.thread.day02;

/**
 * @ClassName; StopThread
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class StopThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("this:" + this.getName());
            System.out.println("thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 5000; i++) {
                if (Thread.interrupted()) {
//                    break;
                    throw new InterruptedException();
                }
                System.out.println(i);
            }
            System.out.println("正常情况break，for被中断后，该语句依然可以执行");
        }catch (InterruptedException e) {
            System.out.println("进入异常处理后，结束线程");
        }
    }
}

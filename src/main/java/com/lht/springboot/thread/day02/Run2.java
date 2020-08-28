package com.lht.springboot.thread.day02;

/**
 * @ClassName; Rrun2
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class Run2 {

    public static void main(String[] args) {
        Interrupt interrupt = new Interrupt();
        interrupt.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        interrupt.interrupt();
        System.out.println("是否停止1:" + interrupt.interrupted());
        System.out.println("是否停止2:" + interrupt.interrupted());

        System.out.println("thread: " + Thread.currentThread().getName());
        Thread.currentThread().interrupt();
        System.out.println("main线程是否停止1:" + Thread.currentThread().isInterrupted());
        System.out.println("main线程是否停止2:" + Thread.currentThread().isInterrupted());
        System.out.println("是否停止1:" + Thread.interrupted());
        System.out.println("是否停止2:" + Thread.interrupted());
        /*
        thread: main
        main线程是否停止1:true
        main线程是否停止2:true
        是否停止1:true
        是否停止2:false
         */
    }
}

package com.lht.springboot.thread.day01;

/**
 * @ClassName; Run2
 * @author: lihantao
 * @Description:
 * @date: 2020/8/11
 */
public class Run2 {

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
//        myThread.start();
        /*
        构造方法执行的线程:main
        run执行的线程:Thread-0
         */

//        myThread.run();
        /*
        构造方法执行的线程:main
        run执行的线程:main
         */
        Thread thread = new Thread(myThread);
        thread.setName("A");
        thread.start();
    }
}

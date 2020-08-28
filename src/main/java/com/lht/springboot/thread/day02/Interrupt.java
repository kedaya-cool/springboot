package com.lht.springboot.thread.day02;

/**
 * @ClassName; Interrupt
 * @author: lihantao
 * @Description:
 * @date: 2020/8/12
 */
public class Interrupt extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}

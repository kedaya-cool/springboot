package com.lht.springboot.test;

/**
 * @ClassName; Count
 * @author: lihantao
 * @Description:
 * @date: 2020/8/3
 */
public class Count {

    private int id;
    private int number;

    public Count() {
    }

    public Count(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

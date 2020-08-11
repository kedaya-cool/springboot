package com.lht.springboot.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName; ListTest
 * @author: lihantao
 * @Description:
 * @date: 2020/8/3
 */
public class ListTest {

    public static void main(String[] args) {
        List<Count> oldCount = new ArrayList<>();
        oldCount.add(new Count(1,1));
        oldCount.add(new Count(2,1));
        oldCount.add(new Count(3,1));
        oldCount.add(new Count(4,1));
        List<Count> newCount = new ArrayList<>();
        newCount.add(new Count(4,1));
        newCount.add(new Count(5,1));
        newCount.add(new Count(6,1));
        newCount.add(new Count(7,1));

        Count oldEndCount = oldCount.get(oldCount.size() -1 );
        Count newStartCount = newCount.get(0);
        if (oldEndCount.getId() == newStartCount.getId()) {
            oldEndCount.setNumber(oldEndCount.getNumber() + newStartCount.getNumber());
            newCount.remove(0);
        }
        oldCount.addAll(newCount);
        System.out.println(oldCount);

    }



}

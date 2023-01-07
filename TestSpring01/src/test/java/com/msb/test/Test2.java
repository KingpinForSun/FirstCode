package com.msb.test;

import com.msb.pojo.Boy;
import com.msb.pojo.Girl;

public class Test2 {
    public static void main(String[] args) {
        Boy b = new Boy();
        b.setAge(27);
        b.setName("Arthes");

        Girl g = new Girl();
        g.setAge(25);
        g.setName("Lily");
        g.setBoyfriend(b);

        System.out.println("girl " + g.getName() + " and boy " + g.getBoyfriend().getName() + " are falling in love");
    }
}

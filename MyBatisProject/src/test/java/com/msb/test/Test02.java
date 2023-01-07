package com.msb.test;

public class Test02 {
    public static void main(String[] args) {
        Chinese ch = new Chinese();
        System.out.println(ch.AGE);
        ch.say();


        American am = new American();
        System.out.println(am.AGE);
        am.say();

        Speak s = new Chinese();
        System.out.println(s.AGE);
        s.say();
    }
}

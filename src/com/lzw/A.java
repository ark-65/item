package com.lzw;

/**
 * Created by IntelliJ IDEA from com.lzw
 *
 * @author: ark_65
 * Date: 2018/3/25
 * Time: 22:12
 * Objective:
 */
public class A {
    private static int x = 1;

    public A doSomeThing(){
        return new A() {
            private int x = 2;
            public void getX() {
                System.out.println(x);
            }
        };
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.doSomeThing());
    }
}

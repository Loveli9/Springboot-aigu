package com.atguigu.controller;

public abstract class HHH {

    private String gg = "123321";

    public void say(){
        System.out.println("123");
    };

    public abstract void sss1();
    protected abstract void sss2();
    //private abstract void sss3();

    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        int c = a^b;
        System.out.println(c);

        int d = a >>> 2;
        System.out.println(d);
    }

}

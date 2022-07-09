package com.company;

public class I2 implements Interface {
    @Override
    public void d() {
        System.out.println("pravin");
    }

    public static void main(String[] args) {
        I2 n=new I2();
        n.d();
    }
}

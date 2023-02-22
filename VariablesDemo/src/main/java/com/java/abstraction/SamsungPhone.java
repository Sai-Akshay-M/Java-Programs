package com.java.abstraction;

public abstract class SamsungPhone implements TouchScreenPhone {

    @Override
    public void scroll() {
        System.out.println("Scroll method from HP Laptop");
    }

}

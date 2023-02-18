package com.java.abstraction;

public abstract class HPLaptop implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("Scroll method from HP Laptop");
    }

}

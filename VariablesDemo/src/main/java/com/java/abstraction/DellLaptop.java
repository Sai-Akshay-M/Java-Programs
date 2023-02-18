package com.java.abstraction;

public abstract class DellLaptop implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("Scroll method from Dell Laptop");
    }
}

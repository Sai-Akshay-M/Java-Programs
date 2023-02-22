package com.java.abstraction;

public abstract class AppleIphone implements TouchScreenPhone {

    @Override
    public void scroll() {
        System.out.println("Scroll method from Apple Iphone");
    }
}

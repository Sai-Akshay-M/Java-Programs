package com.java.abstraction;

public class Test {

        public static void main(String[] args) {

                TouchScreenPhone ai = new AppleIpad();
                ai.scroll();
                ai.click();

                TouchScreenPhone sam = new SamsungTab();
                sam.scroll();
                sam.click();
        }
}

package com.olbati.java8;

/**
 * Created by awahab.
 */
interface A {
    default void doSth() {
        System.out.println("A");
    }
}
interface B {
    default void doSth() {
        System.out.println("B");
    }
}
class FunctionalInterfaceApp implements B, A {

    @Override
    public void doSth() {
        B.super.doSth();
    }

    public static void main(String[] args) {
        new FunctionalInterfaceApp().doSth();
    }
}

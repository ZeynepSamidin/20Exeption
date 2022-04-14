package com.company;

public class Car extends Throwable implements AutoCloseable {
    
    public void drive() {
        System.out.println("Mash jur jatat");
    }

    @Override
    public void close() {
        System.out.println("Mashina jabylyp jatat");
        
    }
}

package org.tutoring.java.day4;

public class CarImpl2 implements Car{
    @Override
    public void run() {
        System.out.println("CarImpl2");
    }

    @Override
    public void stop() {
        System.out.println("CarImpl2stop");
    }
}

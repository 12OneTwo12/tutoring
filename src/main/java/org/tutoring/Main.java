package org.tutoring;

import org.tutoring.java.day1.Car;
import org.tutoring.java.day1.CarFactory;
import org.tutoring.java.day1.Human;
import org.tutoring.java.day1.Mom;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Human jeongIl = new Human("정정일", 27);
//
//        jeongIl.walk();
//        jeongIl.add("awnkdk", "wnklakls"); // 컴파일 예외, 런타임 예외

//        jeongIl.equals("das");
//
//        Mom jeongilMom = new Mom();
//        Human sonJeongil = jeongilMom.getHuman();

        // 차

//        Car exceptionCar = new Car("dnkaskl");
        Car newCar = new Car(4, 1, 1);
        Car newCar1 = new Car(4, 1, 1);
        Car newCar2 = new Car(4, 1, 1);
        Car newCar3 = new Car(4, 1, 1);
        newCar.go();

        CarFactory carFactory = new CarFactory();
        Car factoryCar1 = carFactory.getNewCar();
        Car factoryCar2 = carFactory.getNewCar(2);
        Car factoryCar3 = carFactory.getNewCar(3, 2);
        Car factoryCar4 = carFactory.getNewCar(4 , 3, 1);

        factoryCar1.go();
        factoryCar2.go();
        factoryCar3.go();
        factoryCar4.go();

        Car factoryCar5 = null;

        factoryCar5.go(); // Nullpoint exception runtime 예외
    }
}
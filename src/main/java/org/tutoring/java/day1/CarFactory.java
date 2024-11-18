package org.tutoring.java.day1;

public class CarFactory {

        //응답  //요청
    public Car getNewCar() {
        return new Car(4, 1, 1);
    }

    public Car getNewCar(int w) {
        return new Car(w, 1, 1);
    }

    public Car getNewCar(int w, int e) {
        return new Car(w, e, 1);
    }

    public Car getNewCar(int w, int e, int b) {
        return new Car(w, e, b);
    }
}

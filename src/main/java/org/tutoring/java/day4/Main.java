package org.tutoring.java.day4;

public class Main {

    private final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        Car interfaceCar = new CarImpl();

        interfaceCar.run();
    }

    public void run() {
        userService.login();
    }
}

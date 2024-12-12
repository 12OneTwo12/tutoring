package org.tutoring.java.day4;


public class UserServiceImpl implements UserService{
    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }
}

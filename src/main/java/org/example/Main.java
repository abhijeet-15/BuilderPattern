package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        User user = new User.Builder("Abhijeet", "Singh")
                .setAge(21)
                .setAddress("Mumbai")
                .setPhone("999999999")
                .build();

        System.out.println(user);
    }
}
package com.company;

import com.devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Lion");

        lion.feed();
        lion.takeForAWalk();

        Human jaba = new Human();

        Car car1 = new Car("model1","producer1");
        Car car2 = new Car("model1","producer1");

        System.out.println(car1.equals(car2));
        System.out.println(car1==car2);
        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.toString());
        System.out.println(jaba.toString());
        System.out.println(lion.toString());

    }
}

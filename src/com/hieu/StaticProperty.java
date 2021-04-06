package com.hieu;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3","2.0 l 4-cylinder");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Madaz2", "1.5 l 4-cylinder");
        System.out.println(Car.numberOfCars);
    }
}

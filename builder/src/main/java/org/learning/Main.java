package org.learning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setEngine("V8 Engine").setColor("Red").build();

        System.out.println("Engine: " + car.getEngine() + ", Color: " + car.getColor());
    }
}
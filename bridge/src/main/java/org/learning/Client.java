package org.learning;

public class Client {
    public static void main(String[] args) {
        CarType carType1 = new Sedan();
        Car car1 = new CarInfo(carType1);
        car1.details();

        CarType carType2 = new SUV();
        Car car2 = new CarInfo(carType2);
        car2.details();
    }
}

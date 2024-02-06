package org.learning;

public class CarInfo extends Car {
    public CarInfo(CarType carType){
        super(carType);
    }

    @Override
    public void details(){
        System.out.print("Car Info: ");
        carType.carTypeDetails();
    }
}

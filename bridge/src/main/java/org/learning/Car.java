package org.learning;

public abstract class Car {
    protected CarType carType;

    protected Car(CarType carType){
        this.carType = carType;
    }

    public abstract void details();
}

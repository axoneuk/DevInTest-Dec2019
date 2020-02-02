package uk.axone.devintest.abstractclasses;

public class Car extends Vehicle {


    @Override
    public int getNumWheels() {
        return 4;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    boolean isElectric() {
        return false;
    }

    @Override
    void brake(){
        System.out.println("Car is braking");
    }
}

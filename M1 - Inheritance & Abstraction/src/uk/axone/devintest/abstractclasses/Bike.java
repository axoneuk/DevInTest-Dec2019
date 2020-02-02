package uk.axone.devintest.abstractclasses;

public class Bike extends Vehicle{


    @Override
    public int getNumWheels() {
        return 2;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    boolean isElectric() {
        return true;
    }

    @Override
    void brake(){
        System.out.println("Bike is braking");
    }
}

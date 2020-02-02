package uk.axone.devintest.abstractclasses;

public class Truck extends Vehicle{
    @Override
    public int getNumWheels() {
        return 6;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    boolean isElectric() {
        return false;
    }

    @Override
    void brake(){
        System.out.println("Truck is braking");
    }
}

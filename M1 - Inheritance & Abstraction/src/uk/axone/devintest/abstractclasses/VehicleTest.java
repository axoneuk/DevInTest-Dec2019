package uk.axone.devintest.abstractclasses;

public class VehicleTest {

    public static void main(String[] args) {

        //Abstract classes cannot be instantiated
        //Vehicle myVh = new Vehicle();

        /*Vehicle myCar = new Car();
        myCar.getFuelType();
        myCar.moveForward();//inherited method*/

        Vehicle vh1 = new Car();
        Vehicle vh2 = new Bike();
        Vehicle vh3 = new Truck();

        vh1.brake();
        vh2.brake();
        vh3.brake();

    }
}

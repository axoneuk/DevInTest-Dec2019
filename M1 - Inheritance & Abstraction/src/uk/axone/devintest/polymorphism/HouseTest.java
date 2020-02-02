package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Bike;
import uk.axone.devintest.abstractclasses.Car;
import uk.axone.devintest.abstractclasses.Truck;
import uk.axone.devintest.abstraction.Barclays;
import uk.axone.devintest.abstraction.HSBC;
import uk.axone.devintest.inheritance.MobilePhone;
import uk.axone.devintest.inheritance.Phone;
import uk.axone.devintest.inheritance.SmartPhone;

public class HouseTest {

    public static void main(String[] args) {

        House ramsHouse = new House();
        ramsHouse.setNumRooms(3);
        ramsHouse.setFlat(false);
        ramsHouse.setName("Home");

        MobilePhone rPh = new MobilePhone();
        ramsHouse.setPh(rPh);
        Car rCar = new Car();
        ramsHouse.setVh(rCar);
        HSBC rBank = new HSBC("43-45-09","jiewo");
        ramsHouse.setBk(rBank);

        House tomsHouse = new House();
        tomsHouse.setNumRooms(5);
        ramsHouse.setFlat(false);
        ramsHouse.setName("Tommy");

        tomsHouse.setPh(new SmartPhone());
        tomsHouse.setVh(new Bike());
        tomsHouse.setBk(new Barclays());

        House someHouse = new House();
        someHouse.setVh(new Truck());

    }
}

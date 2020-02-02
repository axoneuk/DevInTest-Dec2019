package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Vehicle;
import uk.axone.devintest.abstraction.Bank;
import uk.axone.devintest.inheritance.Phone;

public class House {

    private int numRooms;
    private boolean isFlat;

    private String name;
    private Phone ph;
    private Vehicle vh;
    private Bank bk;

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPh() {
        return ph;
    }

    public void setPh(Phone ph) {
        this.ph = ph;
    }

    public Vehicle getVh() {
        return vh;
    }

    public void setVh(Vehicle vh) {
        this.vh = vh;
    }

    public Bank getBk() {
        return bk;
    }

    public void setBk(Bank bk) {
        this.bk = bk;
    }
}

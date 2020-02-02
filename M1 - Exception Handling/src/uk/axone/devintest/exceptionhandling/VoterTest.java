package uk.axone.devintest.exceptionhandling;

public class VoterTest {

    public static void main(String[] args) throws InvalidAgeException {
        Voter ram = new Voter();
        ram.setAge(-12);
    }
}

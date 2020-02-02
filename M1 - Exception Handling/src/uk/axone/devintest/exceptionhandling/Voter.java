package uk.axone.devintest.exceptionhandling;

public class Voter {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Voter too young, min age is 18");
        }
        else if(age > 125){
            throw new InvalidAgeException("Voter too old, max age is 125");
        }
        this.age = age;
    }

}

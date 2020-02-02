package uk.axone.devintest.classes;

public class HumanBeing {

    //non-static variables, instance variables
    String name;
    String gender;
    int height;
    int dob;
    String eyeColor;
    String bloodGP;

    //static variable, class Variables
    static  final int numEyes=2;
    static  final int numHands =2;
    static  final int numFingers=10;


    public HumanBeing(String name, String gender){
        this.name = name;
        this.gender = gender;
        breathe();
    }

    public HumanBeing(String hName){
        this.name = hName;
        breathe();
    }


    public void eat(){
        System.out.println(name + " is eating !  "+ eyeColor);
    }

    public void sleep(){
        System.out.println(name + " is sleeping !");
    }

    public void breathe(){
        System.out.println(name + " is breathing !");
    }

    //static methods can only make use of static variables
    public static void walk(){
        System.out.println(numFingers);
        //eyeColor = "blue";

    }



}

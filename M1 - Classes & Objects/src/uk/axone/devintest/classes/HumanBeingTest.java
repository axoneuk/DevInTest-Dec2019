package uk.axone.devintest.classes;

public class HumanBeingTest {

    public static void main(String[] args) {

        //Static variables can be accessed directly using the class name
        System.out.println(HumanBeing.numEyes);
        System.out.println(HumanBeing.numFingers);
        HumanBeing.walk();

        HumanBeing ram = new HumanBeing("Ram D", "male");
        ram.eat();
        ram.sleep();
        //HumanBeing.numEyes=3;

        HumanBeing tom = new HumanBeing("Tom");

        //tom.eat();
        //tom.sleep();



    }
}

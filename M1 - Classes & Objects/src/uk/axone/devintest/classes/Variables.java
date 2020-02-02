package uk.axone.devintest.classes;

import java.io.File;

public class Variables {

    /*Global variables - declared outside of methods and constructors
                       - they can be used throughout the class
        1) Instance variables - non-static
        2) Class variables - static
     */

    //Instance variables - non-static
    String str;
    HumanBeing ram;
    Employee karthik;
    int i;

    //Class variables - static
    static String name;
    static Employee sridevi;
    static int a;
    static HumanBeing pramit;
    static File readMe;

    /*Local variables
        1) Method local variables
        2) Method arguments
     */

    public int doSomething(int numTimes){
        i = 10;
        int j = 20;
        str = "Axone";
        String print = "doing something"; //method local variable
        System.out.println(print + numTimes); //numTimes - method argument
        return j;
    }

    public void doSomethingElse(){
        i = 20;
        str = "Dev in test";
        //static String course = "Smart Tester"; -  static variables can only be declared as global
        //System.out.println(print + numTimes +j);
    }

}

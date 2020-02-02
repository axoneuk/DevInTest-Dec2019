
package uk.axone.devintest.chapter1;

import java.io.File;
import java.util.Calendar;

public class MyClass {

    /**
     * Author : Ram Duvvuri
     */

    //Constructor
    /*
    - Same name as that of the class
    - Does not have a return type
    - Not mandatory - If no constrctors are written, the compiler adds the default one
     */
     public MyClass(){

     }

     public MyClass(String str){

     }

    //These are variables in my program
    int i = 10;
    int k = 30;
    String str = "Axone123%";
    final int NUM_DAYS_WEEK = 7;

    Number num;
    File f1;
    Calendar cal;

    //This is a method which adds the two variables i and k
    void add(){
        int sum = i + k; // Adding the two numbers
        System.out.println(sum);
    }

    //This is a method which multiplies
    void multiply(){
        int result = i * k;
        System.out.println(result);
    }

    int subtract(){
        int result =  k - i;
        return result;
    }

    //This is a method which is commeneted - Block comment
    /*public void divide(){
        int quotient = i / k;
    }*/

    public void main(){

    }

    public static void main(String[] hiuh) {
        System.out.println("Hello");
        //Creating an instance of the class
        MyClass mClass = new MyClass();//Invoking the constrcutor
        mClass.add();
        mClass.multiply();
        int subValue = mClass.subtract();
        System.out.println(subValue);
    }
}

package uk.axone.devintest.arrays;

import uk.axone.devintest.flowcontrol.Car;

import java.io.File;

public class ArrayDemo {

    public static void main(String[] args) {

        //Initialise an array of 10 Strings
        String[] strArr = new String[10];
        strArr[0] = "Ram";
        strArr[1] = "Karthik";

        String[] tools = {"Selenium", "Cucumber", "JBehave"};

        System.out.println(tools[1]);
        System.out.println(tools.length);

        File[] myFiles = new File[10];

        Car[] myCars = new Car[10];

        int[] numArr = {10,20,30,40,50,430804, 437909, 408433};
        numArr[0] = 234;

        System.out.println(numArr.length);

        for(int i =0 ; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }


    }

}

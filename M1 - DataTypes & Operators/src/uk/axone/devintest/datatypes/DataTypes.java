package uk.axone.devintest.datatypes;

import java.io.File;

public class DataTypes {

    //Primitive DataTypes - Are not classes
    //Whole Numbers & Integers
    byte mByte = 127;
    short myShort = 32767;
    int myInt = 9746834;
    long myLong = 949734973489L;

    //Floating point numbers
    float myFloat = 1034340.94390473F; //32 bit number - 7 decimal places
    double myDouble = 89347937.3979340743;// 64 bit - 16 decimal places

    char myChar = '$';//Always enclosed in single quotes

    boolean b1 = true;
    boolean b2 = false;

    //Reference Data Types - are all classes
    String str = new String("Developer In Test");
    File f1 = new File("readme.txt");

    Employee ram = new Employee();
    Employee karhtik = new Employee();

}

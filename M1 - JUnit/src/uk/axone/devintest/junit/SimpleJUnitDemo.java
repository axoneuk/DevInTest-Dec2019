package uk.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJUnitDemo {


    @Test
    public void test2(){
        supportTest();
        System.out.println("Executing test 2");
    }

    @Test
    public void test3(){
        supportTest();
        System.out.println("Executing test 3");
    }

    @Ignore
    public void test1(){
        supportTest();
        System.out.println("Executing test 1");
    }

    private void supportTest(){
        System.out.println("Supporting test run..");
    }

}

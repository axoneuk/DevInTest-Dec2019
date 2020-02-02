package uk.axone.devintest.exceptionhandling;

import java.io.IOException;

public class FileDemoTest {

    public static void main(String[] args) throws Exception {

        FileDemo fDemo = new FileDemo();
        //fDemo.readFileHandle();

        fDemo.readFilePropagate();

    }
}

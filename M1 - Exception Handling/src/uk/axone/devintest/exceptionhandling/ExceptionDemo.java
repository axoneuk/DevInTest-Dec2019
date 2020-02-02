package uk.axone.devintest.exceptionhandling;

import java.sql.Array;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("----- START ------");

        try {

            int x = 10;
            int y = 0;
            int z = x / y;

            String[] strArr = new String[3];
            String str = strArr[4];

        }
        catch(ArithmeticException arthEx){
           System.out.println("Division by zero not allowed");
        }
        catch(ArrayIndexOutOfBoundsException arrEx){
           System.out.println("Please check the array index passed");
        }
        catch (Exception ex) {
            System.out.println("something went wrong");
            System.out.println(ex);
            ex.printStackTrace();
        }
        finally{
            System.out.println("Inside finally block");
        }

        System.out.println("------ END -------");

    }

}

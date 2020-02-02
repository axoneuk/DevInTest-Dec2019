package uk.axone.devintest.flowcontrol;

public class Variables {

    //Global variable
    int count;

    public void method1(){
        count = 9;
    }

    public int method2(String str){
        count = 10;
        return 10;
    }

    public void method3(){
        //local variable
        int i = 10;
        i = 300;
    }

    public void method4(){
       // i = 400;
        count = 2000;
    }

}

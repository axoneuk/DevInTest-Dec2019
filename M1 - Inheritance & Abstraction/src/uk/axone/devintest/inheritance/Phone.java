package uk.axone.devintest.inheritance;

public class Phone {

    private int num;
    private String make;
    private String model;

    public Phone(){
        System.out.println("PHONE Constructor");
    }

    public Phone(String make){

        System.out.println("Phone of make "+ make);
    }

    void makeCall(int callNum){

        System.out.println("PHONE is calling " +callNum);
    }

    //Overloading receiveCall Method
    final void receiveCall(){
        System.out.println("PHONE is receiving a call");
    }

    void receiveCall(int callingNum){
        System.out.println("PHONE is receiving a call from "+ callingNum);
    }

    void receiveCall(int callingNum, int CallNumber){
        System.out.println("PHONE is receiving a call from "+ callingNum + "  "+ CallNumber );
    }

    private void hangUp(){

    }
}

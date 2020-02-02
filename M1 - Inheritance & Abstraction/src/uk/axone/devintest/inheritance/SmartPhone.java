package uk.axone.devintest.inheritance;

public class SmartPhone extends MobilePhone{

    public SmartPhone(){
        System.out.println("SMART PHONE Constructor");
    }

    public SmartPhone(String make){
        super(make, "11 Pro");
        System.out.println("SmartPhone of make "+make);
    }

    void installApp(){
        makeCall(854405);
    }

    void startGPSReceiver(){

    }

}

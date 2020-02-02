package uk.axone.devintest.inheritance;

public class MobilePhone extends Phone {

    public MobilePhone(){
        System.out.println("MOBILE PHONE Constructor");
    }

    public MobilePhone(String make){
        super(make);
        System.out.println("MobilePhone of make "+ make);
    }

    public MobilePhone(String make, String model){
        super(make);
        System.out.println("MobilePhone of make "+ make +" & model "+ model);
    }

    void sendSMS(){

        System.out.println("MOBILEPHONE is sending a SMS");
    }

    //Over-riding the method in the base-class (parent class)
    @Override
    void makeCall(int callNum){

        System.out.println("MOBILE PHONE is calling "+ callNum);
    }

    private void startPhone(){
        //Inherited methods can be called directly in the child class
        receiveCall();
    }


}

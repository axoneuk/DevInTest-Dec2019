package uk.axone.devintest.inheritance;

public class PhoneTest {

    public static void main(String[] args) {

        /*Phone myPhone = new Phone();
        myPhone.makeCall(7848843);
        myPhone.receiveCall();*/

        /*MobilePhone myMobile = new MobilePhone();
        myMobile.makeCall(8958985);
        myMobile.receiveCall();
        myMobile.sendSMS();*/

        /*SmartPhone iPhone = new SmartPhone("Apple");
        iPhone.makeCall(785845784);
        iPhone.receiveCall();
        iPhone.startGPSReceiver();*/

        Phone ph = new MobilePhone();
        ph.makeCall(974973);

        ph.receiveCall();
        ph.receiveCall(12345);
        ph.receiveCall(238723, 490347);

    }

}

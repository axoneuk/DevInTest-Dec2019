package uk.axone.devintest.abstraction;

public class Barclays implements Bank {

    String sortCode;

    @Override
    public void depositCash(int amount) {
        //Barclays specific implementation for ..
    }

    @Override
    public boolean withdrawCash(int amount) {
        //Barclays specific implementation for ..
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public String getSortCode() {
        return sortCode;
    }

    void processMortgage(){

    }

    @Override
    public int getCompanyNumber() {
        return 0;
    }

    @Override
    public String getVATRegistration() {
        return null;
    }

    @Override
    public int getEncryptionType() {
        return 0;
    }
}

package uk.axone.devintest.abstraction;

public class HSBC implements Bank, FinancialInstitution {

    String sortCode;

    public HSBC(String sortCode,String branchName){

    }

    @Override
    public void depositCash(int amount) {
        //HSBC specific implementation for depositCash
    }

    @Override
    public boolean withdrawCash(int amount) {
        //HSBC specific implementation
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

    public boolean processPersonalLoan(){
        //
        return false;
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

    @Override
    public int getFinInstType() {
        return 0;
    }
}

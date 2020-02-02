package uk.axone.devintest.abstraction;

public class BankTest {

    public static void main(String[] args) {

        //An interface cannot be instantiated..
        //Bank myBank = new Bank();

       /* HSBC highSt = new HSBC("40-42-08","Slough HighSt");
        highSt.depositCash(97340);
        highSt.processPersonalLoan();

        Barclays exeterBranch = new Barclays();
        exeterBranch.checkBalance();
        exeterBranch.processMortgage();*/

       Bank hsbc = new HSBC("40-42-08","Slough HighSt");
       hsbc.checkBalance();

    }
}

package uk.axone.devintest.abstraction;

public interface Bank extends Company, UKSecStandards {

    //Variables in an interface are constants - public, static and final
    public static final int FIN_INST_TYPE = 1;

    //All methods in an interface are public and abstract
    public abstract void depositCash(int amount);
    boolean withdrawCash(int amount);
    int checkBalance();
    String getSortCode();

}

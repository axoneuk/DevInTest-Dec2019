package uk.axone.devintest.encap.pack2;

import uk.axone.devintest.encap.pack1.AccessModifiers;

public class AccessModifiersAchild extends AccessModifiers {

    void checkDefaultAccess(){
        //defaultMethod();
        //k=10;
        //flag = true;

    }

    void protectedAccess(){
        protectedMethod();
        n = 34;
    }

    void publicAccess(){
        publicMethod();
        i=56;
    }

}

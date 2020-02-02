package uk.axone.devintest.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    //Handling the exception - surround the code with try/catch
    public void readFileHandle(){
        try {
            FileInputStream fis = new FileInputStream("image.jpg");
            fis.read();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Propagating the exception - add throws to the method signature
    public void readFilePropagate() throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("image.jpg");
        fis.read();
    }

}

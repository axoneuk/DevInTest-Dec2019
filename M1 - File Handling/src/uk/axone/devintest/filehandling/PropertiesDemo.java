package uk.axone.devintest.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    static FileInputStream fis;
    static Properties props;

    public static void main(String[] args) throws Exception {

        try {
            fis = new FileInputStream("/Users/ramduvvuri/IdeaProjects/Developer In Test - Dec 2019/M1 - File Handling/application.properties");
            props = new Properties();
            props.load(fis);

        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found");
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            fis.close();
        }

        String url = props.getProperty("URL");
        System.out.println(url);
        String bro = props.getProperty("browser");
        System.out.println(bro);
    }

}

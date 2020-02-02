package uk.axone.devintest.filehandling;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XMLDemo {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {

        XMLUtil myUtil = new XMLUtil ("/Users/ramduvvuri/IdeaProjects/Developer In Test - Dec 2019/M1 - File Handling/","TestSpec.xml");

        System.out.println(myUtil.xmlReadChildNodeValue("Test","Browser"));

        System.out.println(myUtil.xmlReadChildNodeValue("Test", "ID",2));
        System.out.println(myUtil.xmlReadChildNodeValue("Test", "Browser",2));

        myUtil.xmlModifyChildNodeValue("Test", "Browser","Opera");
    }


}

package com.Michael;

import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class DOMEcho {

    static final String outputEncoding = "UTF-8";

    private static void usage() {
        // ...
    }
    
    public static Collection folderNames(String xml, char startingLetter) throws Exception {
  	   
    	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
       // Document doc = docBuilder.parse (xml); // for files
        Document doc = docBuilder.parse(new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8"))));
        // normalize text representation
        doc.getDocumentElement ();
        doc.getDocumentElement ().normalize ();
        System.out.println ("Root element of the doc is " + 
            doc.getDocumentElement().getNodeName());
        
        NodeList listOfFolders = doc.getElementsByTagName("folder");
        int totalFolders = listOfFolders.getLength();
        System.out.println("Total no of folders : " + totalFolders);
        
        Set collec = new HashSet();
        
        for(int s=0; s<listOfFolders.getLength() ; s++){
        	Node firstPersonNode = listOfFolders.item(s);
        	Element eElement = (Element) firstPersonNode;
        	
			//System.out.println("Staff id : " + eElement.getAttribute("id"));
            
        	//System.out.println(eElement.getAttribute("name"));   
            String myString = 	eElement.getAttribute("name");
            if ( myString.indexOf('u')==0)	{
            	
            	collec.add(myString);
            }
             
        }
            
         return collec;
    }

    public static void main(String[] args) throws Exception {
        String filename = null;
            
            int i=0;
            if (args.length<=0) { 
            	String xml =
                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                            "<folder name=\"program files\">" +
                                "<folder name=\"uninstall information\" />" +
                            "</folder>" +
                            "<folder name=\"users\" />" +
                        "</folder>";
            	
                System.out.println ("no input file");
            	 folderNames(xml, 'u');
                Collection<String> names = folderNames(xml, 'u');
                for(String name: names)
                    System.out.println(name);
            } 
            else {
                filename = args[i];
                if (i != args.length - 1) {
                    usage();
                }
            }
         

        if (filename == null) {
            usage();
        }
    }
}

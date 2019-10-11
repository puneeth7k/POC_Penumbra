package info.methods;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


public class ReadXmlFile 
{
     	public static void main(String[] args)

    {
        System.out.println(ReadFile("TestCases.xml","1"));
    	System.out.println("file");
    }

            public static String ReadFile(String fileName,String id)
        {

                String testinput = null;
                String projectPath=System.getProperty("user.dir");
                System.out.println(projectPath);
                
                File fXmlFile = new File(projectPath+"\\src\\test\\java\\resources"+File.separator+fileName);
                System.out.println(fXmlFile);
                
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = null;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
            Document doc= null;
            try {
                doc = dBuilder.parse(fXmlFile);
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                XPath xPath =  XPathFactory.newInstance().newXPath();
                String expression = String.format("/TestCases/Test[@id='"+id+"']/Name");
                System.out.println(expression);
            Node node = null;
            try {
                node = (Node) xPath.compile(expression).evaluate(doc, XPathConstants.NODE);
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }
            testinput = node != null ? (node.getTextContent()) : "cannot read the test case xml file";
                return testinput;
        
              
         
        
    }
}
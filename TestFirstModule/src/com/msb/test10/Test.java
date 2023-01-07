package com.msb.test10;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;

public class Test {
    public static void main(String[] args) throws DocumentException {
        SAXReader sr = new SAXReader();

        Document dom = sr.read(new File("TestFirstModule/src/com/msb/students.xml"));
        System.out.println(dom);

        Element studentsEle = dom.getRootElement();
        Iterator<Element> it1 = studentsEle.elementIterator();

        while (it1.hasNext()){
            Element studentEle = it1.next();

            List<Attribute> atts = studentEle.attributes();
            for(Attribute a:atts){
                System.out.println("该节点的子属性：" + a.getName() + "---" + a.getText());
            }

            Iterator<Element> it2 = studentEle.elementIterator();
            while (it2.hasNext()){
                Element eles = it2.next();
                System.out.println("节点：" + eles.getName() + "---" + eles.getText());
            }
            System.out.println();
        }
    }
}

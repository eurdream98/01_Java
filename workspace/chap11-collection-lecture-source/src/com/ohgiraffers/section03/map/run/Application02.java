package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) throws IOException {
        /*Properties에 대해 이해하고 사용할 수 있다.*/
        Properties prop = new Properties();

        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:this:@127.0.0.0:1521:xe");
        prop.setProperty("user","student");
        prop.setProperty("password","student");

        System.out.println("prop : "+prop);
        System.out.println("-----1-------");
        Iterator<Object> a = prop.keySet().iterator();
        while(a.hasNext()){
            String key = (String) a.next();
            System.out.println(key+"="+prop.get(key));
        }
        System.out.println("-----2-------");
        Collection b1 = prop.values();
        Iterator b = b1.iterator();
        while(b.hasNext()){
            String value = (String) b.next();
            System.out.println("value ="+value);
        }
//        System.out.println("-----3---------");
//        Iterator<Map.Entry<String,String>> entry = (Iterator<Map.Entry<String, String>>) prop.entrySet();
//        while(entry.hasNext()){
//            Map.Entry entry1= entry.next();
//            System.out.println(entry1.getKey()+"="+entry1.getValue());
//        }
        prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
        prop.store(new FileWriter("drvier.txt"),"jdbc driver");
        prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");

        /*파일로부터 읽어와서 Properties 객체에 담기*/
        Properties prop2 = new Properties();
        prop2.load(new FileInputStream("driver.dat"));
        prop2.load(new FileReader("drvier.txt"));
        prop2.loadFromXML(new FileInputStream("driver.xml"));
        prop2.list(System.out);

    }
}

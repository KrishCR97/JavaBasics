/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaw01;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author s528751
 */
public class JavaW01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!!");
        System.out.println("Hai Cody");
        //JVM - Interpreter
        //Compiler -> translates hihlevel code to java byte code.
        //javac filename.java -> to compile a java program  - .class file extension
        //java filename -> to execute a java program
        
        //An object reperesents both state-Members and behavior-Methods.
        Dog d = new Dog("Jimmy", "Pamperian", 7);
        System.out.println(d.getName());
        System.out.println(d.increementAge());
        //out -- is a printstream object
        Rectangle rect = new Rectangle(12, 6);
        System.out.println(rect.getHeight());
         Dog d1 = new Dog("Ppp","a",1);
         System.out.println(d1.hashCode());
        
    }
    
}

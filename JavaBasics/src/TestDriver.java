/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GameS
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Initially the written java code gets converted to java byte code when 
        //.java file is compiled and it is portable on all machines.
        //Then interpreted transalates this byte code to machine understandable 
        //code and executes the code.
        
        //javac javafileName.java -> .class file is generated.
        //java javaFileName -> converts .class file and machine executes it.
        System.out.println("Hello");
        System.out.println("Hello".length());
        System.out.println("Hello".indexOf("o"));
        String r = new String("I love java");
        String s = new String(" Jumping Jeroos ");
        String t = new String("Bearcats");
        String u = new String("northwest");
        System.out.println(r.toUpperCase());
        System.out.println(t.toLowerCase());
        System.out.println(u.length());
        System.out.println(s.trim());
        System.out.println("Hello".split(" "));
        System.out.println(r.substring(4));
        System.out.println(r.substring(2,6));
        System.out.println("Hello Hello".substring(1, 3));
    }
    
}

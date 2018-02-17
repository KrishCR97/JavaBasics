
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GameS
 */
public class ObjectsLabs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "Why";
        String string2 = " choose ";
        String string3 = "   Northwest ";
        String string4 = "among";
        String string5 = " other     ";
        String string6 = " Universities ";
        String string7 = string1.concat(string2).concat(string3).
                concat(string4).concat(string5).concat(string6);
        System.out.println("Length is :"+string7.length());
        System.out.println(string1.trim()+" "+string2.trim()+" " + string3.trim()
                +" " + string4.trim() + " " + string5.trim() + " "+string6.trim() 
                + " ?");
        String string8 = string7.substring(string7.indexOf("Universities"), 
                string7.indexOf("Universities") + string6.trim().length());
        System.out.println(string8.indexOf("i"));
        String string9 = "computer Applied science Applied Computer science "
                + "science Applied computer Appleid computer Science Applied "
                + "computer Applied";
        System.out.println(string9.indexOf("Computer"));
        System.out.println(string7.substring(string7.indexOf("Northwest"),
                string7.indexOf("Northwest") + "Northwest".length()) + " is  one " 
                + string7.substring(string7.indexOf("among"),string7.indexOf("among")
                + "among".length()) + " the ");
        System.out.println();
        int value1 = 27,value2 = 4;
        Math.pow(value1, value2);
        double cosValue = Math.cos(value1);
        System.out.println(1/cosValue);
        double myNumber = 43.35;
        Math.sqrt(myNumber);
        int myNumber1 = 30 , myNumber2 = 60;
        Random r = new Random();
        System.out.println(r.nextInt(300));
        
        
        

        
        
        
    }
    
}

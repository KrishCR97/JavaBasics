/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaw02;

/**
 *
 * @author s528751
 */
import java.util.Scanner;
import javax.swing.JFileChooser;
public class JavaW02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //New operator does 3 things :
        //1. Creates memory for that object.
        //2. Assign default values for the variables
        //3.return the reference of the created object.
        
//Static data is stored in heap area and dynamic data is stored in heap area.
        System.out.println(Math.ceil(2.1));
        //Scanner class in java
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.nextLine());
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        jfc.getSelectedFile();
       sc.close();
        
    }
    
}

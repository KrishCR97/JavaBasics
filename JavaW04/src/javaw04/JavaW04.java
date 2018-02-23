/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaw04;

/**
 *
 * @author s528751
 */
public class JavaW04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[3];
        numbers[0] = 1;
        int[] values = numbers.clone();
        int[] vals = new int[3];
        System.arraycopy(values, 0, vals, 0, vals.length);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.Random;

/**
 *
 * @author eg191141
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int  n = rand.nextInt(40) + 1;
        
        System.out.print(n);
        
               
    }
    
}

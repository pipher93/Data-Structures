/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplestructures;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author morning
 */
public class Test {
    
    
    public static void  main (String args []){
        
        
        
        
         System.out.println(" ......TESTING THE LIST CLASS......");
                List l = new List ();
                l.add(5);
                l.add(10);
                l.add(15);
            System.out.println("Testing Print");
            System.out.println("--------------------");
            System.out.println("Initial Values");
            l.print();
            System.out.println("--------------------");
            System.out.println("Testing Count");
            int c=0; 
            c= l.count(c);
            System.out.println("Total values " + c);
            
            
            System.out.println("--------------------");
            System.out.println("Testing first Element");
            System.out.println("The First Element Is : " + l.FirstElement());
            System.out.println("The End Element Is : " + l.EndElement());
           
            
    } 
}

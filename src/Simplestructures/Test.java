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

    public static void main(String args[]) {

        System.out.println(" ......TESTING THE LIST CLASS......");
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Testing Print:...");
        System.out.println("--------------------");
        System.out.println("Initial Values:");
        l.print();
        System.out.println("--------------------");
        System.out.println("Testing Count:...");
        int c = 0;
        c = l.count();
        System.out.println("Total values: " + c);
        System.out.println("--------------------");
        System.out.println("The First Element Is : " + l.FirstElement());
        System.out.println("The End Element Is : " + l.EndElement());
        System.out.println("--------------------");
//        System.out.println("Removing Node "+ l.remove(4) );
//        System.out.println("New List :");
//        System.out.println("--------------------");
//        System.out.println("Removing Firts Element :...");
//        l.Removefirtselement();
//        l.print();
//         System.out.println("Removing Last Element :...");
//        l.Removelastselement();
//        l.print();
        System.out.println("Duplicate :...");
        l.duplicate();
        l.print();
         System.out.println("Duplicate Mirrior :...");
        l.duplicatemirror();
        l.print();
    }
}

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

     List l = new List();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        
        System.out.println("Probando Lista....");
        System.out.println("----------");
        System.out.println("ELementos De La Lista...");
        l.print();
         System.out.println("----------");
        System.out.println("Imprimiendo Elementos En Reversa...");
        l.reversePrint();
        l.print();
        System.out.println("----------");
        System.out.println("Removiendo Elemeto..."+l.remove(5));
        System.out.println("Lista Despues De Remover Elemento...");
        l.print();
        System.out.println("----------");
        System.out.println("Contando Elementos...");
        System.out.println("La Lista Tiene:.."+l.count()+" Elementos");
        System.out.println("----------");
        System.out.println("El Primer Elemeto De La Lista Es..."+l.FirstElement());
        System.out.println("El Ultimo Elemeto De La Lista Es..."+l.EndElement());
        System.out.println("----------");
        System.out.println("Eliminando Primer Elemento...");
        l.Removefirtselement();
        l.print();
        System.out.println("Eliminando Ultimo Elemento...");
        l.Removelastselement();
        l.print();
        System.out.println("----------");
        System.out.println("Duplicando Elementos Al Final...");
        l.duplicate();
        l.print();
        System.out.println("Duplicando Elementos DE Atras Hacia Adelante...");
        l.duplicatemirror();
        l.print();
        System.out.println("----------");
        System.out.println("Invirtiendo Elementos ...");
        l.invert();
        l.print();
        
        
        
        
    }
}

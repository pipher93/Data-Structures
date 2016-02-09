/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queve;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main(String[] args) {
        Queve q = new Queve();
        
        for(int i=0;i<20;i++){
            q.add(i);
        }
        
        System.out.println("Initial Values");
        q.print();
        
        int d= q.remove();
        System.out.print(""+d);
        
        System.out.println("Current value: ");
        
        q.print();
    }
}

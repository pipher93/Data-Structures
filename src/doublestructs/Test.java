/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doublestructs;

/**
 *
 * @author AULA6
 */
public class Test {
    
    public static void main (String args[]){
        
        
        List dl = new List();
        
        int values[] = {28, 4, 5, 17, 9, 30, 21, 45, 8};
        
        for (int i=0; i < values.length; i++){
            dl.add(values[i]);
        }
        System.out.print("valores de la lista: ");
        dl.print();
        System.out.print("Impresion invertida: ");
        dl.reversePrint();
        
        dl.remove(3);
        System.out.print("Despues de remover el nodo de la posicion 3: ");
        dl.print();
        
        /* homework 4*/ 
        dl.findAndRemove(9);
        System.out.print("encontrar y remover el numero 9: ");
        dl.print();
        
        
    }
    
}

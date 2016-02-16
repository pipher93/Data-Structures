/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplestructures;



/**
 *
 * @author morning
 */
public class List {
    private Node head;
    
    
    public List (){
        head = null;
    }
    public void add (int d) {
        Node n = new Node(d); // guarad numeros
        if (head == null){// si esta vacia...
            head=n;
        } else {
            Node aux = head;
            while ( aux.Next != null){
                aux = aux.Next;
                
            }
            aux.Next=n;
        } 
    }
    
    
    public void print (){
        Node aux = head;
        while (aux != null){
          System.out.print(" " +aux.data);
          aux=aux.Next; 
      }  
          System.out.println(" ");
    }
    
    
   public int count(int c){
       
       Node aux= head;
       int counter = 0;
       while (aux != null) {           
           counter ++;
           aux=aux.Next;
       }
       
       return counter;
   }
    
  public int FirstElement(){
    

        Node aux = head;

        while (aux != null) {
            if (head == aux) {
                return aux.data ;
            }
            aux = aux.next;
        }
        return -1;
  }
    
 public int EndElement(){
        
        Node aux = head;

        while (aux != null) {

            if ( aux==aux.next) {
                return aux.data;
            }
            aux = aux.next;
        }
        return -1;
  }
       
 } 
   
 
   
      




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
            while ( aux.next != null){
                aux = aux.next;
                
            }
            aux.next=n;
        } 
    }
    
    
    public void print (){
        Node aux = head;
        while (aux != null){
          System.out.print(" " +aux.data);
          aux=aux.next; 
      }  
          System.out.println(" ");
    }
    
    
   public int count(){
       
       Node aux= head;
       int counter = 0;
       while (aux != null) {           
           counter ++;
           aux=aux.next;
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
    Node aux=head;    
    Node n=aux;
    
     if (head==null)return -1;
     if (head.next!=null) {
         head=head.next;
     
     while (aux!=null&&aux.next!=null) {         
         aux=aux.next;
         n=aux;
     }
        
     }else{
         System.out.println("-1");
     }
   return n.data;
}
   
    
// public  int remove ( int p){
//        if (head == null) {
//            return 0;
//        }
//       if (p == 0) {
//            head = head.next;
//            return 0;
//        }
//
//        Node aux = head;
//        Node q = null;
//        int counter =0;
//        for (;counter<p && aux!=null;counter++) {
//            q = aux;
//            aux = aux.next;
//
//            if (aux == null) {
//                return 0;
//            }
//        }
//        q.next = aux.next;
//        return q.data;
//       
//}
 
 public void Removefirtselement(){
     Node aux=head;
     if(head==null)return ;
     if(head!=null){
         aux=aux.next;
         head=aux;
     }
     head=head.next;
 }

    void Removelastselement() {
        Node aux= head;
        Node n= aux;
         if (head==null) return;
         if(head.next!=null){
             head=head.next;
         }
         while(aux!=null&&aux.next!=null){
             aux=aux.next;
             n=aux;
         }
         n.next=aux.next;
    }
     public void duplicate() {           
         Node aux=head;
           if(head==null)return;
           Node Last = head;
           while(Last.next!=null){
               Last=Last.next;
           }
            int c = count();
            for(int i=0;i<c;i++){
                Last.next = new Node(aux.data);
                aux=aux.next;
                Last=Last.next;
            }
            
        }
     public void duplicatemirror(){
//         Node aux=head;
//           if(head==null)return;
//           Node Last = head;
//           while(Last.next!=null){
//               Last=Last.next;
//           }
//            int c = count();
//            for(int i=0;i<c;i++){
//                Last.next = new Node(aux.data);
//                Node n =Last.next; 
//                aux=aux.next;
//                Last.next=n;
//            }
     }

   
    }

   


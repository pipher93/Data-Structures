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
        head =null ;
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
     public int remove(int p) {

        if (head == null) {
            return 0;
        }

        Node aux = head;

        if (p == 0) {
            head = aux.next;
            return aux.data;
        }

        Node q = head;

        for (int i = 0; i < p; i++) {
            q = aux;
            aux = aux.next;

            if (aux == null) {
                return 0;
            }
        }
        q.next = aux.next;
        return aux.data;
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
   
    

 
 public void Removefirtselement(){
     if(head==null)return ;
    
         head=head.next;
     
     
 }

    void Removelastselement() {
       Node aux = head, n = head;

        while (n.next != null) {

            aux = n;
            n = n.next;

        }
        aux.next = null;
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
         Node aux=head;
           if(head==null)return;
           Node last = aux;
           while(aux.next==null){
               last=aux.next;
           }
            int c = count();
            for(int i=0;i<c;i++){
                last = new Node(aux.data);
                Node n =last.next; 
                aux=aux.next;
                last.next=n;
                
            }
     }
      public void reversePrint() {

        if (head == null) {
            return;
        }

        Node aux = head, done = null;

        do {
            aux = head;
            while (aux.next != null && aux.next != done) {
                aux = aux.next;
            }
            System.out.print(" " + aux.data);
            done = aux;
        } while (done != head);
        System.out.println();
    }
      
      public void invert(){
          if(head==null)return;
          Node aux= head;
          Node head2=null;
          
          while(head!= null){
              aux=head;
              head=head2;
              aux.next=head2;
              head2=aux;
          }head=head2;
      }

      
      // HOME WORk 1
      
       public void eliminarintercalado(){
       Node aux = head;
       Node p = aux;
       int c= count();
        for (int i=0; i<c; i++){
            if(i%2==1){
                p.next=aux.next;
            }
            p=aux;
            aux=aux.next;
        }
    }
    
    
    public void Duplicateintercalete(){
        Node aux = head;
        int c= count();
        for(int i=0; i<c; i++){
            Node n=new Node(aux.data);
            n.next=aux.next;
            aux.next=n;
            aux=n.next;
        }
    }
    
    public void DeleteDuplicate(){
        Node p,aux = null,back=head;
        
        while(aux.next!=null){
            p=head;
            while(p!=aux){
                if(p.data==aux.data){
                    back.next=aux.next;
                }
                p=p.next;
            }
            back=aux;
            aux=aux.next;
        }
    }
    
    
    //EVALUACION 
        public void insertzero(){
         Node aux= head;
         if (head==null)return;
         int c=count();
         for(int i=1;i<c;i++){
             Node n = new Node(0);
             n.next=aux.next;
             aux.next=n;
             aux=n.next;
         }
             
              
          
     }
     public void removemiddle(){
        
         
     }
     public int countodds( ){
      int cont = 0;
        Node aux = head;

        while (aux != null) { 
            if (aux.data % 2 == 1) {
                cont++;
               }
            
           aux = aux.next;
           
       }  
        return cont;
     }
   
    }

   


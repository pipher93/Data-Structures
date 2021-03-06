/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doublestructs;

/**
 *
 * @author AULA6
 */
public class List {

    private Node head;

    public List() {
        head = null;
    }

    public void add (int v) {
        Node n = new Node(v);

        if (head == null) {
            head = n;
        } else {
            Node aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }
    }

    public int remove(int p) {
        
        if (head == null) return 0;
        
        //pendiente validacion
        
        Node aux = head;
        int counter = 0;
        
        while(aux !=null){
            
            if (counter == p){
                if (aux.back!=null) aux.back.next = aux.next; else head = head.next;
                
                if (aux.next!=null) aux.next.back = aux.back;
                
                return aux.value;
            }
           aux = aux.next; 
           counter++;
        }
        return 0;
    }

    public int print() {

        Node aux = head;

        while (aux != null) {
            System.out.print(" " + aux.value);
            aux = aux.next;
        }
        System.out.println();
        return -1;
    }

    
    public void reversePrint() {

        Node aux = head;

        while (aux != null && aux.next != null) {
            aux = aux.next;
        }

        while (aux != null) {
            System.out.print(" " + aux.value);
            aux = aux.back;
        }
        System.out.println();
    }
     
    public void ascendingOrder(){
        Node head2=null;
        while(head !=null){
            Node aux=head;
            head=head.next;
            if(head2==null){
                head2=aux;
                aux.next=null;
                aux.back=null;
            }
            else{
                Node p=head2;
                while(p.next !=null && aux.value>p.value){
                    p=p.next;
                }
                if(aux.value>p.value){
                    aux.next=null;
                    aux.back=p;
                    p.next=aux;
                }
                else{
                    aux.next=p;
                    aux.back=p.back;
                    p.back.next=aux;
                    p.back=aux;
                }
            }
        }
        head=head2;
    }
    public void findAndRemove(int v) {

        Node aux = head;
        
        
        while(aux !=null){
            
            if (aux.value == v){
                if (aux.back!=null) aux.back.next = aux.next; else head = head.next;
                
                if (aux.next!=null) aux.next.back = aux.back;
                
            }
           aux = aux.next; 
           
        }
    }

    
}
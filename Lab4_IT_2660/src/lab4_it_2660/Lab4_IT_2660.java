/*
 * The purpose of this lab is to demonstrate my understanding
 * of the LinkedList Structure and also using Generic 
 * implementation.
 */
package lab4_it_2660;

/**
 *
 * @author jeff
 */
public class Lab4_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericSinglyLinkedList gLink = new GenericSinglyLinkedList();
        Listing l1 = new Listing("Jeff", "12233", "4.9");
        Listing l2 = new Listing("Junna", "32345", "4.5");
        Listing l3 = new Listing("Justin", "123432", "4.9");
        Listing l4 = new Listing("Jerry", "76537653", "3.3");
        Listing l5 = new Listing("New insert", "874865", "3.1");
        Listing l6 = new Listing("New insert at end of list", "8484", "2.2");
        
        Node newNode = new Node("A", l1);
        Node n1 = new Node("B", l2);
        Node n2 = new Node("C", l3);
        gLink.insert(newNode, 0);
        gLink.insert(n1, 1);
        gLink.insert(n2,2);
        gLink.showAll();
        System.out.println();
        
        System.out.println("After an insert at a new position\n");
        Node n3 = new Node("D", l4);
        gLink.insert(n3, 1);
        gLink.showAll();
        System.out.println();
        
        System.out.println("After an attempt at placing a node at the root and last to check for edge cases");
        Node n4 = new Node("E", l5);
        gLink.append(n4);
        gLink.showAll();
        
        
        
        
        
    }
    
}

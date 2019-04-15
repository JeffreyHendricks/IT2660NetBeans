/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_it_2660;

/**
 *
 * @author jeff
 */
public class Lab6_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinaryTree binaryTreeOne = new BinaryTree();
        
        Listing student1 = new Listing("Jeff", "012", "4.5");
        Listing student2 = new Listing("Junna", "123", "3.0");
        Listing student3 = new Listing("Meina", "234", "3.0");
        Listing student4 = new Listing("Chikako", "345", "2.1");
        Listing student5 = new Listing("Vijitra", "456", "3.6");
        Listing student6 = new Listing("Huiyu", "567", "5.4");
        Listing student7 = new Listing("Brooke", "678", "0.3");
        Listing student8 = new Listing("Zooey", "789", "1.1");
        Listing student9 = new Listing("Sombra", "890", "0.1");
        
        Listing student10 = new Listing("Hanzo","001", "6.7");
        Listing student11 = new Listing("Genji", "002", "6.4");
        
        binaryTreeOne.insert(student1);
        binaryTreeOne.insert(student2);
        binaryTreeOne.insert(student3);
        binaryTreeOne.insert(student4);
        binaryTreeOne.insert(student5);
        binaryTreeOne.insert(student6);
        binaryTreeOne.insert(student7);
        binaryTreeOne.insert(student8);
        binaryTreeOne.insert(student9);
        
        binaryTreeOne.showAll();
        
        binaryTreeOne.update("Sombra", student10);
        
        binaryTreeOne.showAll();
        
        binaryTreeOne.delete("Jeff");
        
        binaryTreeOne.showAll();
        
        
    }
    
}

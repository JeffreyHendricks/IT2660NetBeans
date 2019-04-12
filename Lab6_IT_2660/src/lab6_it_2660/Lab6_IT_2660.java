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
        Listing l1 = new Listing("Jeff","12345","4.5");
        Listing l2 = new Listing("Junna","54321","5.3");
        Listing l3 = new Listing("V","12345","4.6");
        Listing l4 = new Listing("Joseph","54543","6.0");
        
        System.out.println(binaryTreeOne.insert(l1));
        System.out.println(binaryTreeOne.insert(l2));
        
        
        Listing new1 = binaryTreeOne.fetch("Jeff");
        System.out.println(new1);
        
        Listing new2 = binaryTreeOne.fetch("Junna");
        System.out.println(new2);
        
        binaryTreeOne.insert(l3);
        
        binaryTreeOne.showAll();
        
        binaryTreeOne.update("Jeff", l4);
        
        Listing new3 = binaryTreeOne.fetch("Joseph");
        
        binaryTreeOne.delete("Joseph");
        
        binaryTreeOne.showAll();
        
        
    }
    
}

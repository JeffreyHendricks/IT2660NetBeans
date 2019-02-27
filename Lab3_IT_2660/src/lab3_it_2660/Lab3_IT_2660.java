/*
 * The purpose of this lab is to demonstrate an understanding
 * of Stacks and Ques and how to implement them correctly.
 */
package lab3_it_2660;

/**
 *
 * @author jeff
 */
public class Lab3_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack newStack = new Stack(3);
        Stack stack2 = new Stack(3);
        Listing l;
        Listing listing1 = new Listing("Jeffrey","123 hellDrive","123 4567");
        Listing listing2 = new Listing("Junna","321 heavenAvenue","765 4321");
        Listing listing3 = new Listing("Jenna","3456 hendricks Road","111 1111");
        Listing listing4 = new Listing("Joseph","3456 Acord Avenue", "101 0011");
        Listing listing5 = new Listing("Jessica", "5454 aborn ave", "000 0000");
        Listing listing6 = new Listing("Aphrodite","000 Mt. Olympus","010 1010");
        
        System.out.println("Example of a pop method on an empty stack, followed by 3 pushes.");
        System.out.println(newStack.pop());
        
        System.out.println(newStack.push(listing1));
        System.out.println(newStack.push(listing2));
        System.out.println(newStack.push(listing3));
        System.out.println();
        
        System.out.println("This is an example of my peek operation.");
        System.out.println(newStack.peek());
        
        System.out.println("This is the showAll method after the peek, demonstrating no nodes have been deleted.");
        newStack.showAll();
        
        System.out.println("I will now try to push a fourth listing object into the stack");
        System.out.println(newStack.push(listing4));
        System.out.println();
        
        System.out.println("This is the example of my other insert allowing for dynamic memory allocation");
        System.out.println(stack2.push2(listing1));
        System.out.println(stack2.push2(listing2));
        System.out.println(stack2.push2(listing3));
              
        System.out.println(stack2.push2(listing4));
        System.out.println(stack2.push2(listing5));
        System.out.println(stack2.push2(listing6));
        System.out.println();
        
        stack2.showAll();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it_2660_final;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
public class IT_2660_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Graph flyUS = new Graph(100);
        Scanner keyboard = new Scanner(System.in);
        
        
        for(int i = 0; i < 100; i++)
        {
            Listing v = new Listing((int)(Math.random()*300));
            flyUS.insertVertex(i,v);
        }
        
        for(int i = 0; i < 100; i++)
        {
            int randomNum = (int)(Math.random()*5)+1;
            int count = randomNum;
            
            while(count <= 5)
            {
                flyUS.insertEdge(i, (int)(Math.random()*100));
                count++;
            }
        }
        
        for(int i = 0; i < 100; i++)
        {
            System.out.println("Hub " + i + "\'s ");
            flyUS.showVertex(i);
            System.out.println("its routes are: ");
            flyUS.showEdges(i);
            System.out.println();
        }
        
        System.out.println("Please enter the number you wish to search for: ");
        int userNumber = keyboard.nextInt();
        keyboard.nextLine();
        if(userNumber > 99 || userNumber < 0)
        {
            System.out.println("You cannot enter a number larger than 99 "
             + "or less than 0.");
            System.out.println("Please try again");
            
            userNumber = keyboard.nextInt();
            keyboard.nextLine();
        }
        
        System.out.println("Next please enter the method you wish to use.");
        System.out.println("Enter \"D\" for Depth first or \"B\" for Breadth first");
        System.out.println("Or if you want to see the shortest path then \"DA\" "
                + "for Dikjstras Algorithm");
        String userAnswer = keyboard.nextLine();
        while(!(userAnswer.equalsIgnoreCase("D") || userAnswer.equalsIgnoreCase("B")))
        {
            System.out.println("Search was unsuccessful.");
            System.out.println("Please try again.");
            userAnswer = keyboard.nextLine();
        }
        if(userAnswer.equalsIgnoreCase("D"))
        {
            System.out.println("The search was successful!");
            System.out.println("DFT of the graph starting at vertex: " 
                    + userNumber);
            flyUS.DFT(userNumber);
            System.out.println("The number of nodes visited are: " 
                    + flyUS.getCount());
        }
        else if(userAnswer.equalsIgnoreCase("B"))
        {
            System.out.println("The search was successful!");
            System.out.println("BFT of the graph starting at vertex: " 
                    + userNumber);
            flyUS.BFT(userNumber);
            System.out.println("The number of nodes visited are: " 
                    + flyUS.getCount());
        }
        /*else if(userAnswer.equalsIgnoreCase("DA"))
        {
            System.out.println("The search was successful!");
            System.out.println("The shortest path of the vertex: " + userNumber 
            + " is: ");
            //flyUS.DAlg(userNumber);
        }*/
        else
        {
            System.out.println("Search was unsuccessful. Try again!");
            System.exit(0);
        }
    }
}

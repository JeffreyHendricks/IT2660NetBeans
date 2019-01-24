/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_it_2660;

/**
 *
 * @author jeff
 */
public class Lab1_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Listing listingOne = new Listing("Jeffrey", 23);
        Listing listingTwo = new Listing();
        
        System.out.println(listingOne.toString());
        
        System.out.println("Now you will be asked to enter listTwo's information");
        listingTwo.input();
        System.out.println(listingTwo);
        
        System.out.println("You should now see the name and age of listingOne changed to Jenna and 22");
        listingOne.setName("Jenna");
        listingOne.setAge(22);
        
        System.out.println(listingOne.getName());
        System.out.println(listingOne.getAge());
        
        //Homework Question 42 Listing Array Work
        
        Listing[] arrayList;
        arrayList = new Listing[3];
        
        System.out.println("You will now be asked to enter the information for an array of 3 Listing objects");
        System.out.println("It will then be printed back to you in reverse order");
        
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = new Listing();
            arrayList[i].input();
        } 
         
        for(int j = 2; j > -1; j--){
            System.out.println(arrayList[j].toString());
        }
        
    }
    
}

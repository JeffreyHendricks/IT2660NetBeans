/*
 * This is for my second lab of IT 2600. The purpose of this
 * program is to work on creating separate classes and work 
 * my way into making them generic data structures capable of
 * using the four basic operations.
 */
package lab2_it_2660;

/**
 *
 * @author jeff
 */
public class Lab2_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentListings student1 = new StudentListings("Jeff","12345","4.0");
        StudentListings student2 = new StudentListings();
        StudentListings student3 = new StudentListings("Jeff","12345","4.0");
        StudentListings student4 = new StudentListings("Jenna","12321","2.6");
        StudentListings student5 = new StudentListings("Junna","12321","4.5");
        
        
        student2.input();
        System.out.println(student4.toString());
        System.out.println(student2.toString());
        System.out.println(student1.toString());
        
        System.out.println(student1.compareTo("Jeff"));
        
        StudentListings copy = student3.deepCopy();
        
        System.out.println(copy.toString()); 
        
        System.out.println("*** Test of the Insert Operation *** ");
        ListOfStudents newList = new ListOfStudents(new StudentListings("Junna","12345","4.0"));
        newList.insert(new StudentListings("Jenna","13254","3.0"),1);
        newList.insert(new StudentListings("Jeff","13254","3.0"),2);
        newList.insert(new StudentListings("Joseph","13254","3.0"),3);
        newList.insert(new StudentListings("Timmy","13254","3.0"),4);
        newList.insert(new StudentListings("Zomb-E","13254","3.0"),5);
        newList.insert(new StudentListings("Meina","13254","3.0"),6);
        newList.insert(new StudentListings("Moyu","13254","3.0"),7);
        
        newList.showAll();
        
        System.out.println("\n*** This is a test of the fetch operation! ***\n");
        System.out.println(newList.fetch("Jeff"));
        System.out.println("\n");
        System.out.println(newList.fetch("Jenna"));
        StudentListings jeff = new StudentListings("Jeffrey", "12345678", "7.8");
        
        System.out.println("\n*** Test of the Delete Operation ***");
        System.out.println("\n");
        System.out.println(newList.delete("Jeff"));
        System.out.println(newList.delete("Meina"));
        System.out.println("\n");
        newList.showAll();

       System.out.println("*** Test of the update operation ***");
       System.out.println("\n");
       System.out.println(newList.update("Jenna", jeff, 1));
       System.out.println(newList.fetch("Jeffrey"));
       newList.showAll();
        
    }
    
}

/*
 * This is for my second lab of IT 2600. The purpose of this
 * program is to work on creating separate classes and work 
 * my way into making them generic data structures capable of
 * using the four basic operations.
 */
package lab2_it_2660;

import javax.swing.JOptionPane;

/**
 *
 * @author jeff
 */
public class StudentListings {
    
    private String name;
    private String identificationNumber;
    private String gradePointAverage;
    
    public StudentListings()
    {
        this.name = "";
        this.identificationNumber = "";
        this.gradePointAverage = "";
    }
    
    public StudentListings(String n, String num, String g)
    {
        this.name = n;
        this.identificationNumber = num;
        this.gradePointAverage = g;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString()
    {
        return("The students name is: " + this.name +
                "\nTheir identification number is: " + this.identificationNumber + 
                "\nAnd their GPA is: " + this.gradePointAverage);
    }
    
    public StudentListings deepCopy()
    {
        StudentListings clone = new StudentListings(name, identificationNumber, gradePointAverage);
        return clone;
    }
    
    public int compareTo(String targetKey)
    {
        return(this.name.compareTo(targetKey));
    }
    
    public void input()
    {
        name = JOptionPane.showInputDialog("Enter a name");
        identificationNumber = JOptionPane.showInputDialog("Enter an identification number");
        gradePointAverage = JOptionPane.showInputDialog("Enter a grade point average");
    }
    
}

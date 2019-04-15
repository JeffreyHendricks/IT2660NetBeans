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
public class Listing {
    private String name;
    private String idNumber;
    private String gradePointAverage;
    
    public Listing()
    {
        name = "";
        idNumber ="";
        gradePointAverage = "";
    }
    
    public Listing(String n, String id, String gpa)
    {
        name = n;
        idNumber = id;
        gradePointAverage = gpa;
    }
    
    public String toString()
    {
        return ("The name is: " + name + "\nThe id number is: " + idNumber +
                "\nThe GPA is: " + gradePointAverage + "\n");
    }
    
    public int compareTo(String targetKey)
    {
        return (name.compareTo(targetKey));
    }
    
    public Listing deepCopy()
    {
        Listing clone = new Listing(name,idNumber,gradePointAverage);
        return clone;
    }
    
    public String getKey()
    {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_it_2660;

import javax.swing.JOptionPane;

/**
 *
 * @author jeff
 */
public class Listing implements GenericNode{
    private String studentName;
    private String studentId;
    private String studentGpa;
    
    public Listing(){
        this.studentName = "";
        this.studentId = "";
        this.studentGpa = "";
    }
    
    public Listing(String n, String num, String gpa)
    {
        this.studentName = n;
        this.studentId = num;
        this.studentGpa = gpa;
    }
    
    public String toString()
    {
        return("The Name is: " + studentName +
                "\nTheir identification number is: " + studentId + 
                "\nTheir GPA is " + studentGpa);
    }
    
    public Listing deepCopy()
    {
        Listing clone = new Listing(studentName, studentId, studentGpa);
        return clone;
    }
    
    public int compareTo(String targetKey)
    {
        return(this.studentName.compareTo(targetKey));
    }
    
    public void setGpa(String gpa)
    {
        this.studentGpa = gpa;
    }
    
    public void input()
    {
        this.studentName = JOptionPane.showInputDialog("Enter the students name.");
        this.studentId = JOptionPane.showInputDialog("Enter the students identification number.");
        this.studentGpa = JOptionPane.showInputDialog("Enter the students GPA");
    }
    
}

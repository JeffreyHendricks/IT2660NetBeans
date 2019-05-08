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
public class Listing {
    private int number;
    boolean pushed;
    
    public Listing(int n)
    {
        number = n;
    }
    
    public String toString()
    {
        return("Number is: " + number);
    }
    
    public Listing deepCopy()
    {
        Listing clone = new Listing(number);
        return clone;
    }
    
    public boolean getPushed()
    {
        return pushed;
    }
    
    public void setPushed(boolean value)
    {
        pushed = value;
    }
    
    public void visit()
    {
        System.out.println(this);
    }
}

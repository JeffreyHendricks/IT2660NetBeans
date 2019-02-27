/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_it_2660;

/**
 *
 * @author jeff
 */
public class Stack {
    private Listing[] data;
    private int top;
    private int size;
    
    public Stack()
    {
        this.top = -1;
        this.size = 100;
        this.data = new Listing[100];
    }
    
    public Stack(int n)
    {
        this.top = -1;
        this.size = n;
        this.data = new Listing[n];
    }
    
    public boolean push(Listing newNode)
    {
        if(top == size - 1)
            return false;       //Overflow error
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return true;
        }
    }
    
    public boolean push2(Listing newerNode)
    {
        Listing[] temp;
        Listing[] larger;
        larger = new Listing[data.length + 1];
        
        if(top >= size - 1)
        {
            temp = data;
            data = larger;
            
            for(int i = 0; i < temp.length; i++)
                     
                data[i] = temp[i];
            
        
        
            top = top + 1;
            data[top] = newerNode.deepCopy();            
        }
        else if(top < size - 1)
        {
            top = top + 1;
            data[top] = newerNode.deepCopy();
        }
            return true;
        
    }
    
    public Listing pop()
    {
        int topLocation;
        if(top == -1)
            return null;        //Underflow error
        else
        {
            topLocation = top;
            top = top - 1;
            return data[topLocation];
        }
    }
    
    public Listing peek()
    {
        int topL;
        if(top == -1)
            return null;        //Underflow error
        else
        {
            topL = top;
            return data[topL];
        }
    }
    
    public void showAll()
    {
        for(int i = top; i >= 0; i--)
            System.out.println(data[i].toString());
    }
}

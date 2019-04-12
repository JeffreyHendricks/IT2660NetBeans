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
public class BinaryTree {
    
    Listing[] data;
    int size;
    
    public BinaryTree()
    {
        size = 100;
        data = new Listing[100];
    }
    public BinaryTree(int n)
    {
        size = n;
        data = new Listing[size];
    }
    
    public boolean insert(Listing newListing)
    {
        int i = 0;
        while(i < size && data[i] != null)
        {
            if(data[i].getKey().compareTo(newListing.getKey()) == -1)
            {
                i = (2 * i +1);
            }
            else
            {
                i = (2 * i + 2);
            }
        }
        if(i >= size)
        return false;
        else
        {
            data[i] = newListing.deepCopy();
            return true;
        }
    }
    
    public Listing fetch(String targetKey)
    {
       int i = 0;
       while(i < size && data[i]!= null && data[i].getKey().compareTo(targetKey) != 0)
       {
           if(data[i].getKey().compareTo(targetKey) == -1)
           {
               i = (2 * i + 1);
           }
           else
               i = (2 * i + 2);
       }
       if(i >= size || data[i] == null)
       return null;
       else
           return data[i].deepCopy();
    }
    
    public boolean delete(String targetKey)
    {
        int i = 0;
        int next = i + 1;
        while(data[i] != null && !(data[i].getKey().compareTo(targetKey) == 0))
        {
            i++;
        }
        if(data[i] != null)
        {
            data[i] = data[next];
            return true;
        }
        else
            return false;
    }
    
    public boolean update(String targetKey, Listing newListing)
    {
        if(delete(targetKey) == false)
            return false;
        else if(insert(newListing) == false)
            return false;
        else
            return true;
    }
    
    public void showAll()
    {
        for(int i = 0; i <= data.length-1; i++)
        {
            if(data[i] == null)
            {
                System.out.println("");
            }
            else
            System.out.println(data[i].toString());
        }
    }
}

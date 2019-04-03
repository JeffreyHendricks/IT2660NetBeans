/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_it_2660;

/**
 *
 * @author jeff
 */
public class Lab5_IT_2660 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] randomNumbers = new int[100];
        
        for(int i = 0; i < randomNumbers.length; i++)
        {
            int num = (int)Math.floor(Math.random() * 100)+1;
            randomNumbers[i] = num;
            System.out.println(i + ": " + randomNumbers[i]);
        }
        
        mergeSort(randomNumbers);
        
        for(int j = 0; j < randomNumbers.length; j++)
        {
                              
            System.out.println(j + ": " + randomNumbers[j]);
                
        }
        
        
        
        
        
        
    }
    
    public static void mergeSort(int[] a)
    {
        //Base case
        if(a.length < 2){
            return;
        }
        
        //Reduced Problem
        int middle = a.length/2;
        int[] left = new int[middle];
        int[] right = new int[a.length-middle];
        
        for(int i = 0; i < middle; i ++)
        {
            left[i] = a[i];
        }
        
        for(int j = middle; j < a.length; j++)
        {
            right[j - middle] = a[j];
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right, middle, a.length-middle);
    }
    
    public static void merge(int[] a, int[] left, int[] right, int l, int r) {
  
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
            a[k++] = left[i++];
            }
            else {
            a[k++] = right[j++];
                 }
        }
        while (i < l) {
            a[k++] = left[i++];
        }
        while (j < r) {
            a[k++] = right[j++];
        }
    }
    
}

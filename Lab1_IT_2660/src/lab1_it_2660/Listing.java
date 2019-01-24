/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_it_2660;
import java.util.Scanner;
/**
 *
 * @author jeff
 */
public class Listing {
    
    private String name;
    private int age;
    Scanner keyboard = new Scanner(System.in);
    
    public Listing(){
        this.name = "";
        this.age = 0;
    }
    
    public Listing(String n, int a){
        this.name = n;
        this.age = a;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void input(){
        System.out.println("Please enter the name followed by the age: ");
        this.name = keyboard.nextLine();
        
        this.age = keyboard.nextInt();
        
        keyboard.nextLine();
    }
    
    @Override
    public String toString(){
        return ("The name is: " + name + " \nand the age is: " + age);
    }
    
}

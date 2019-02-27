package lab3_it_2660;

/**
 *
 * @author jeff
 */
public class Listing {
    private String name;
    private String address;
    private String number;
    
    public Listing()
    {
        this.name = "";
        this.address = "";
        this.number = "";
    }
    
    public Listing(String n, String a, String num)
    {
        this.name = n;
        this.address = a;
        this.number = num;
    }
    
    public String toString()
    {
        return("The Name is " + name + "\n" +
                "The Address is " + address + "\n" + 
                "The Number is " + number + ".\n");
    }
    
    public Listing deepCopy()
    {
        Listing clone = new Listing(name, address, number);
        return clone;
    }
}

package vendingmachineinventory;

/******************************************************************************
 * Inventory.java 
 * Programmer: @author jcboyd
 * 
 * This class is associated with VendingMachineInventory.java
 *****************************************************************************/

import java.util.Scanner;

public class Inventory 
{
    Scanner stdIn = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    //*************************************************************************
    
    public Inventory(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } //end Inventory constructor
                
    //*************************************************************************
            
    public void display()
    {
        System.out.printf("Name: %s, price: $%.2f, Quantity: %d\n",
                this.name, this.price, this.quantity);
    } //end display
    
    //*************************************************************************
    
    public void newStock()
    {
        int quantity; //hold input value for quantity of new stock
        double price; //hold total price of new stock
        System.out.printf("How many bottles of %s are you delivering? ", this.name);
        quantity = stdIn.nextInt();
        stdIn.nextLine(); //clearing Scanner
        this.quantity += quantity;
        price = this.price * quantity;
        System.out.printf("Received $%.2f of %s\n",
                price, this.name);
    } //end newStock
            
} //end class Inventory

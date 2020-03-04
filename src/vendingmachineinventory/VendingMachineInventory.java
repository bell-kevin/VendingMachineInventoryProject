package vendingmachineinventory;

/******************************************************************************
 * VendingMachineInventory.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program simulates the inventory and sales for a vending machine
 *****************************************************************************/

public class VendingMachineInventory {

    public static void main(String[] args) 
    {
        //instantiate starting inventory
        Inventory item1 = new Inventory("Mountain Dew", 1.5, 25);
        Inventory item2 = new Inventory("water", 1, 15);
        Inventory item3 = new Inventory("Apple juice", 2, 20);
        //display current inventory
        System.out.println("Module 3 Competency by JC Boyd");
        System.out.println("\nStarting inventory:");
        item1.display();
        item2.display();
        item3.display();
        //accept delivery of additional inventory
        System.out.println("");
        item1.newStock();
        item2.newStock();
        item3.newStock();
        //display updated (current) inventory
        System.out.println("\nCurrent inventory:");
        item1.display();
        item2.display();
        item3.display();
    } //end main
    
} //end class VendingMachineInventory

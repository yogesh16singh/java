package LLD_Interview_Problems.Vending_Machine.UtilityClasses;

import LLD_Interview_Problems.Vending_Machine.Common_Enums.Item_Type;

// Class representing an item in the vending machine
public class Item {
    // Type of the item (e.g., COKE, PEPSI)
    private Item_Type type;

    // Price of the item
    private int price;
    // Getters and Setters
    public Item_Type getType() {
        return type;
    }
    public void setType(Item_Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

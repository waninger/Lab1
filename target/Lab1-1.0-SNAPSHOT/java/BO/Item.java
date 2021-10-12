package BO;

import DB.DBItem;

import java.util.Collection;

public class Item {
    private String name;
    private String category;
    private float price;
    private int amount;
    private int itemID;

    public Item(String name, String category, float price, int amount, int itemID){
        this.itemID = itemID;
        this.category = category;
        this.price = price;
        this.amount = amount;
        this.name = name;
    }
    public static Collection<Item> searchItem(String name){
        return DBItem.getItems(name);
    }

    public static Item searchItem(int id) {
        return DBItem.getItems(id);
    }

    public static void updateAmount(int id, int amount) {
        DBItem.updateAmount(id, amount);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public int getItemID() {
        return itemID;
    }

    public Item getItem(int id) {
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

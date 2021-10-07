package BO;

import DB.DBItem;

import java.util.Collection;

public class Item {
    public static int itemID;
    public String name;

    public Item(String name, int itemID){
        this.itemID = itemID;
        this.name = name;
    }
    public static Collection<Item> searchItem(String name){
        return DBItem.getItems(name);
    }

    public String getName() {
        return name;
    }

    public int getItemID() {
        return itemID;
    }
}

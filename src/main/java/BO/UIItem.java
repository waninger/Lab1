package BO;


import DB.DBItem;

import java.util.Collection;

public class UIItem {
    public String name;
    public String category;
    public float price;
    public int amount;
    public int itemID;

    public UIItem(String name, String category,float price,int amount,int itemID){
        this.name = name;
        this.category = category;
        this.price = price;
        this.amount = amount;
        this.itemID = itemID;
    }
    public static Collection<UIItem> getItem(String name){
        return ItemHandler.SearchItems(name);
    }
    //gör sök på id
    public static UIItem getItem(int id) {
        return ItemHandler.SearchItems(id);
    }

    @Override
    public String toString() {
        return "UIItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", itemID=" + itemID +
                '}';
    }
}

package BO;


import DB.DBItem;

import java.util.Collection;

public class UIItem {
    public String name;
    public int itemID;

    public UIItem(String name, int itemID){
        this.itemID = itemID;
        this.name = name;
    }
    public static Collection<UIItem> getItem(String name){
        return ItemHandler.SearchItems(name);
    }
}

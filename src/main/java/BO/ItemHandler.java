package BO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItemHandler {
    public static ArrayList<UIItem> SearchItems(String name){
        ArrayList<UIItem> items = new ArrayList<UIItem>();

        Iterator it = Item.searchItem(name).iterator();
        while (it.hasNext()){
            Item i = (Item) it.next();
            items.add(new UIItem(i.getName(),i.getCategory(),i.getPrice(),i.getAmount(),i.getItemID()));
        }

        return items;
    }

    public static UIItem SearchItems(int id) {
        Item i = Item.searchItem(id);
        return new UIItem(i.getName(),i.getCategory(),i.getPrice(),i.getAmount(),i.getItemID());
    }

    public static void updateStock(int id, int amount) {
        Item.updateAmount(id, amount);
    }
}

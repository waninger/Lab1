package BO;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemHandler {
    public static ArrayList<UIItem> SearchItems(String name){
        ArrayList<UIItem> cart = new ArrayList<UIItem>();
        cart.add(new UIItem("hatt", 1));

        Iterator it = Item.searchItem(name).iterator();
        while (it.hasNext()){
            Item i = (Item) it.next();
            cart.add(new UIItem(i.getName(),i.getItemID()));
        }
        return cart;
    }
}

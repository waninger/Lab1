package BO;

import java.util.ArrayList;

public class ItemHandler {
    public static ArrayList<UIItem> SearchItems(){
        ArrayList<UIItem> cart = new ArrayList<UIItem>();
        cart.add(new UIItem("hatt", 1));

        return cart;
    }
}

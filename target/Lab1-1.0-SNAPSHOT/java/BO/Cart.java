package BO;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> cart;

    public Cart() {
        cart = new ArrayList<>();
    }
    public void add(Item item){
        cart.add(item);
    }
    public int getSize() {
        return cart.size();
    }
}

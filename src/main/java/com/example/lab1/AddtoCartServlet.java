package com.example.lab1;

import BO.Cart;
import BO.Item;
import BO.UIItem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@WebServlet(name = "AddtoCartServlet", value = "/AddtoCart")
public class AddtoCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("cart") == null) {
            ArrayList<Item> cart = new ArrayList<Item>();
            request.getSession().setAttribute("cart",cart);
        }

        ArrayList<Item> tempCart = (ArrayList<Item>) request.getSession().getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));

        Item item = UIItem.getItem(id);
        tempCart.add(item);
        System.out.println(item.getName());
        /*
        for(Item i:tempCart) {
            System.out.println(i.getName());
        }*/

        RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
        try{
            rd.forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

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
        if(request.getSession().getId() == null) {

        }
        if(request.getSession().getAttribute("cart") == null) {
            ArrayList<UIItem> cart = new ArrayList<UIItem>();
            request.getSession().setAttribute("cart",cart);
        }

        ArrayList<UIItem> tempCart = (ArrayList<UIItem>) request.getSession().getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));

        UIItem item = UIItem.getItem(id);
        tempCart.add(item);

        RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
        try{
            rd.forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

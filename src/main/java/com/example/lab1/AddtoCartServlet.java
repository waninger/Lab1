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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getId() == null) {

        }
        if(request.getSession().getAttribute("cart") == null) {
            ArrayList<UIItem> cart = new ArrayList<UIItem>();
            int sum =0;
            request.getSession().setAttribute("cart",cart);
            request.getSession().setAttribute("sum", sum);
        }

        ArrayList<UIItem> tempCart = (ArrayList<UIItem>) request.getSession().getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));


        UIItem item = UIItem.getItem(id);
        tempCart.add(item);

        int totalSum = (int) request.getSession().getAttribute("sum");
        totalSum += item.price;
        request.getSession().setAttribute("sum",totalSum);
        UIItem.updateStock(id, item.amount);

        //RequestDispatcher rd = request.getRequestDispatcher("/Webshop");
        try{
            //rd.forward(request,response);
            System.out.println("hej");
            ServletContext servletContext = getServletContext();
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/Webshop");
            requestDispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

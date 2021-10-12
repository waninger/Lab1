package com.example.lab1;

import BO.UIItem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AddtoCartServlet", value = "/AddtoCart")
public class AddtoCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        UIItem item = UIItem.getItem(id);

        if(request.getSession().getAttribute("name") == null) {
            RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
            try{
                rd.forward(request,response);
            }catch (ServletException e) {
                e.printStackTrace();
            }
        } else if(item.amount<=0) {
            RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
            try{
                rd.forward(request,response);
            }catch (ServletException e) {
                e.printStackTrace();
            }
        } else {

            if(request.getSession().getAttribute("cart") == null) {
                ArrayList<UIItem> cart = new ArrayList<UIItem>();
                float sum =0;
                request.getSession().setAttribute("cart",cart);
                request.getSession().setAttribute("sum", sum);
            }

            ArrayList<UIItem> tempCart = (ArrayList<UIItem>) request.getSession().getAttribute("cart");
            tempCart.add(item);

            float totalSum = (float) request.getSession().getAttribute("sum");
            totalSum += item.price;
            request.getSession().setAttribute("sum",totalSum);
            UIItem.updateStock(id, item.amount);

            RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
            try{
                rd.forward(request,response);
            }catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }
}

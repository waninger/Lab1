package com.example.lab1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.UIItem;

import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "WebshopServlet", value = "/Webshop")
public class WebshopServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("search item  " + request.getParameter("search Items"));
        Collection items = UIItem.getItem((String)request.getParameter("search"));
        request.setAttribute("items",items);
        RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");

        try{
            rd.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

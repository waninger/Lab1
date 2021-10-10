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

@WebServlet(name = "UIItemhandler", value = "/UIItemHandler")
public class UIItemhandler extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("search  " + request.getParameter("search"));
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

package com.example.lab1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        if(name != null && password != null) {
            session.setAttribute("name", name);
            session.setAttribute("password", password);
            session.setAttribute("cart", null);
        }
        try{
            getServletContext().getRequestDispatcher("/Webshop").forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }

    }
}

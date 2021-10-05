package com.example.lab1;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import BO.ItemHandler;

@WebServlet(name = "LoginServlet", value = "/Login")
public class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String t = ItemHandler.SearchItems();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+ name + password + t +"</h1>");
        out.println("</body></html>");


/*
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        request.setAttribute("name",t);
        request.setAttribute("password",t);

        try{
            rd.forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }
*/
    }
}

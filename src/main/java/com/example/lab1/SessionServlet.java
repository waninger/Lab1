package com.example.lab1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        if(name != null && password != null) {
            session.setAttribute("name", name);
            session.setAttribute("password", password);
        }

       // response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+ session.getAttribute("name") + session.getAttribute("password") + "</h1>");
        out.println("</body></html>");
        System.out.println("are we here?");

        RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
        try{
            rd.forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

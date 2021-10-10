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

@WebServlet(name = "LogoutServlet", value = "/Logout")
public class LogoutServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
       // PrintWriter out=response.getWriter();

        RequestDispatcher rd = request.getRequestDispatcher("logout.jsp");
        HttpSession session=request.getSession();
        session.invalidate();
        rd.forward(request,response);
       /* out.print("You are successfully logged out!");

        out.close();*/

    }
}

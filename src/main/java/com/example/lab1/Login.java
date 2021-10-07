package com.example.lab1;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import BO.ItemHandler;
import BO.LoginHandler;

@WebServlet(name = "LoginServlet", value = "/Login")
public class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean verify = LoginHandler.login(name,password);

        request.setAttribute("name","name");
        request.setAttribute("password","password");
        request.setAttribute("verify",verify);

        RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

        try{
            rd.forward(request,response);
        }catch (ServletException e) {
            e.printStackTrace();
        }

    }
}

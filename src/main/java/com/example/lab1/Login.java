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

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean verify = true;
                //LoginHandler.login(name,password);
        request.setAttribute("verify",verify);
        if(verify){
            RequestDispatcher req = request.getRequestDispatcher("SessionServlet");
            RequestDispatcher rd = request.getRequestDispatcher("webshop.jsp");
            try{
                req.forward(request,response);
                rd.forward(request,response);
            }catch (ServletException e) {
                e.printStackTrace();
            }
        }else {
            try {
                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                rd.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }
}

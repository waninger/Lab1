package com.example.lab1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.UIItem;

import java.io.IOException;

@WebServlet(name = "UIItemhandler", value = "/UIItimHandler")
public class UIItemhandler extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }
}

package com.chrisxyq.servlet.demo;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "ForwardTestServlet", value = "/ForwardTestServlet")
public class ForwardTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Attribute","Attribute");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ForwardServlet");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

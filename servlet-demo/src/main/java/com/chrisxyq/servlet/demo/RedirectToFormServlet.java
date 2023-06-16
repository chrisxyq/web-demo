package com.chrisxyq.servlet.demo;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "RedirectToFormServlet", value = "/RedirectToFormServlet")
public class RedirectToFormServlet extends HttpServlet {
    /**
     * 请求重定向的第二种方案（推荐
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("http://localhost:8080/form.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

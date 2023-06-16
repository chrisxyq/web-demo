package com.chrisxyq.servlet.demo;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuanqixu
 */
@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String username = request.getParameter("username");
        final Cookie cookie = new Cookie("username", username);
        //一周
        cookie.setMaxAge(60 * 60 * 24 * 7);
        response.addCookie(cookie);

        final Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (Cookie cookiee : cookies) {
            out.println("<h1>" + "cookie["+cookiee.getName()+"="+cookiee.getValue()+"]" + "</h1>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init(ServletConfig servletConfig) {
    }
}

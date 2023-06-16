package com.chrisxyq.servlet.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletRequestServlet", value = "/ServletRequestServlet")
public class ServletRequestServlet extends HttpServlet {
    /**
     * httpServletRequest类获取请求的参数值
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String remoteHost = request.getRemoteHost();
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        final String[] hobby = request.getParameterValues("hobby");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "client ip:" + remoteHost + "</h1>");
        out.println("<h1>" + "username:" + username + "</h1>");
        out.println("<h1>" + "password:" + password + "</h1>");
        out.println("<h1>" + "hobby:" + hobby.toString() + "</h1>");
        out.println("</body></html>");
    }
}

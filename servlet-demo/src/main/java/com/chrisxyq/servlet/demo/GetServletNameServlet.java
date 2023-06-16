package com.chrisxyq.servlet.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuanqixu
 */
@WebServlet(name = "GetServletNameServlet", value = "/GetServletNameServlet")
public class GetServletNameServlet extends HttpServlet {
    private String message;

    /**
     * servlet默认是单例，为每个请求分配一条线程，线程不安全
     * 如果在web.xml文件同一个 Servlet 映射了多个 <url-pattern>，也会生成多例
     * 只第一次调用该servlet时候被调用
     * @param servletConfig
     */
    @Override
    public void init(ServletConfig servletConfig) {
        final ServletContext servletContext = servletConfig.getServletContext();
        message = "servletConfig.getServletName():"+servletConfig.getServletName();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}
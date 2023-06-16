package com.chrisxyq.servlet.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuanqixu
 */
@WebServlet(name = "GetMethodServlet", value = "/GetMethodServlet")
public class GetMethodServlet implements Servlet {
    /**
     * servletrequest有个子类叫httpServletRequest
     * 通过使用httpServletRequest的getMethod方法，可以获取前端（form表单）提交的请求类型是get/post
     * 判断方法是get方法调用还是post调用
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        servletResponse.setContentType("text/html");

        PrintWriter out = servletResponse.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + method + "</h1>");
        out.println("</body></html>");
    }

    private String message;

    /**
     * servlet默认是单例，为每个请求分配一条线程，线程不安全
     * 如果在web.xml文件同一个 Servlet 映射了多个 <url-pattern>，也会生成多例
     * 只第一次调用该servlet时候被调用
     *
     * @param servletConfig
     */
    @Override
    public void init(ServletConfig servletConfig) {
        message = "Hello World!";
        final ServletContext servletContext = servletConfig.getServletContext();
        System.out.println("servletConfig.getServletName():" + servletConfig.getServletName());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }


    @Override
    public void destroy() {
    }
}
package com.chrisxyq.servlet.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.LinkedHashMap;

@WebFilter("/*")
public class AdminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.得到ServletContext中的IPMap
        ServletContext application = req.getServletContext();
        //2.获取客户端IP
        String IP = req.getRemoteAddr();
        //3.获得并操作Map
        LinkedHashMap<String, Integer> ipMap = (LinkedHashMap<String, Integer>) application.getAttribute("ipMap");
        if (ipMap.containsKey(IP)) {
            int ipValue = ipMap.get(IP);
            ipMap.put(IP, ++ipValue);
        } else {
            ipMap.put(IP, 1);
        }
        application.setAttribute("ipMap", ipMap);
        //4.放行
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void destroy() {
    }
}

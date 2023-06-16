package com.chrisxyq.servlet.demo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author yuanqixu
 * 监听器：javaweb的三大组件之一
 * ServletContextListener：监听 ServletContext 对象的创建和销毁
 * ServletContext在web工程启动时候创建，web工程停止时候销毁
 */
@WebListener()
public class MyServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("===contextInitialized===");
        //1.创建ServletContext
        ServletContext application = sce.getServletContext();
        //2.Map
        HashMap<String, Integer> ipMap = new LinkedHashMap<>();
        //3.把Map保存到ServletContext中
        application.setAttribute("ipMap",ipMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("===contextDestroyed===");
    }
}

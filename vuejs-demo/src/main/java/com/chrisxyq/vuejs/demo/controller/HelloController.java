package com.chrisxyq.vuejs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chrisxu
 * @create 2020-06-08 20:37
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */

@Controller
public class HelloController {
    //    @ResponseBody：hello world要写出去要加上
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "Hello World";
    }

}

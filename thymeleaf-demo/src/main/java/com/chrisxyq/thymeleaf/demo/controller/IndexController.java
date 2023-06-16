package com.chrisxyq.thymeleaf.demo.controller;

import com.chrisxyq.thymeleaf.demo.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title", "传递的title");
        model.addAttribute("description", "传递的description");
        model.addAttribute("keywords", "传递的keywords");
        return "index";
    }

    @GetMapping("/basic")
    public String basic(Model model) {
        UserVO userVO = new UserVO();
        userVO.setUsername("username");
        userVO.setAge(22);
        userVO.setIsVip(true);
        userVO.setCreateTime(new Date());
        userVO.setSex(1);
        userVO.setTags(Arrays.asList("PHP", "Node"));
        userVO.setIsA(Boolean.FALSE);
        userVO.setIsB(true);
        userVO.setIsC(true);
        model.addAttribute("user", userVO);
        model.addAttribute("htmlcontent","<div>html内容</div>");
        return "basic";
    }
}

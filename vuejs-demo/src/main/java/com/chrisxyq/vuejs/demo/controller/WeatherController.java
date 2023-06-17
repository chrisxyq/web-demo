package com.chrisxyq.vuejs.demo.controller;

import com.chrisxyq.vuejs.demo.utils.ObjectSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class WeatherController {
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping(value = "/queryWeather/{city}")
    public String queryWeather(HttpServletRequest request, @PathVariable("city") String city) throws IOException {
        String actionUrl = "http://wthrcdn.etouch.cn/weather_mini?city=" + city;
        Object responseEntity = restTemplate.getForObject(actionUrl, Object.class);
        return ObjectSerializer.toJson(responseEntity);
    }


}

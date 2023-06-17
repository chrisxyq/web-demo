package com.chrisxyq.vuejs.demo.entity;

import lombok.Data;

@Data
public class Forecast {
    private String date;
    private String fengLi;
    private String fengXiang;
    private String high;
    private String low;
    private String type;
}

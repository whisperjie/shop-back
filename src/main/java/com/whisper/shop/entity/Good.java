package com.whisper.shop.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    private int id;
    private String name;
    private String unit;//单位 件，瓶
    private float price;//价格
   // private
    //private String wxplay;
    //private Boolean ischeck;
}

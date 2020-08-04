package com.whisper.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {
    private int id;
    private String name;
    private String password;
    private String address;//公司地址
    private String phone;
    private List<Good> goods;//公司商品
    private String alipay;//支付宝账号
    private Map<Good,Integer> Stock;//库存

}

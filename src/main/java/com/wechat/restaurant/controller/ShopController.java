package com.wechat.restaurant.controller;

import com.wechat.restaurant.entity.Shop;
import com.wechat.restaurant.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @RequestMapping("/find")
    @ResponseBody
    public Shop findShop() {
        return shopService.searchAllShop().get(0);
    }

}

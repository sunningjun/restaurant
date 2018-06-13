package com.wechat.restaurant.service;

import com.wechat.restaurant.entity.Collection;
import com.wechat.restaurant.entity.Product;
import com.wechat.restaurant.entity.Shop;
import com.wechat.restaurant.repository.CollectionRepository;
import com.wechat.restaurant.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> searchAllShop() {
        return shopRepository.findAll();
    }


}

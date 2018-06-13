package com.wechat.restaurant.repository;

import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Integer> {
}

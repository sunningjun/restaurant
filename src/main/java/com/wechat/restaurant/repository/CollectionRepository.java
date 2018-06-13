package com.wechat.restaurant.repository;

import com.wechat.restaurant.entity.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection,Integer> {
    Integer  deleteByProductId(Integer productId);
}

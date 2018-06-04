package com.wechat.restaurant.repository;

import com.wechat.restaurant.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
     List<Product> findByNameLike(String name);
     List<Product> findAllByCategory(String category);
}

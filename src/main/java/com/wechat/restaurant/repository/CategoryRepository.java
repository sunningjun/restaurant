package com.wechat.restaurant.repository;

import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

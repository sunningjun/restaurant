package com.wechat.restaurant.dto;

import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class SearchAllResult {
    private Category category;
    private List<Product> productList;
}

package com.wechat.restaurant.service;

import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Product;
import com.wechat.restaurant.dto.SearchAllResult;
import com.wechat.restaurant.repository.CategoryRepository;
import com.wechat.restaurant.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Product> searchProductByName(String name){
        return productRepository.findByNameLike(name);
    }

    public List<Product> searchProductByCategory(String category){
        return productRepository.findAllByCategory(category);
    }
    public List<Category> searchAllCategory(){
        return categoryRepository.findAll();
    }
    public List<SearchAllResult> searchAll(){
        List<SearchAllResult> results=new ArrayList<>();
        List<Category> categoryList=searchAllCategory();
        for (Category ca:categoryList){
            List<Product> productList=searchProductByCategory(ca.getName());
            SearchAllResult result=new SearchAllResult(ca,productList);
            results.add(result);
        }
        return results;
    }
    public Product searchProductById(String id){
        Integer productId=Integer.parseInt(id);
        return  productRepository.findById(productId).get();
    }
}

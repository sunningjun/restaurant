package com.wechat.restaurant.controller;

import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Product;
import com.wechat.restaurant.dto.SearchAllResult;
import com.wechat.restaurant.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/findByName")
    @ResponseBody
    public List<Product> findByName(@RequestParam  String name){
        String selectedName="%"+name+"%";
        return searchService.searchProductByName(selectedName);
    }
    @RequestMapping("/findById")
    @ResponseBody
    public Product findById(@RequestParam  String id){
        return searchService.searchProductById(id);
    }

    @RequestMapping("/findByCategory")
    @ResponseBody
    public List<Product> findByCategory(@RequestParam  String category){
        return searchService.searchProductByCategory(category);
    }
    @RequestMapping("/findAllCategory")
    @ResponseBody
    public List<Category> findAllCategory(){
        return searchService.searchAllCategory();
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<SearchAllResult> findAll(){
        return searchService.searchAll();
    }
}

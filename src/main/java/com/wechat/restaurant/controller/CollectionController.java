package com.wechat.restaurant.controller;

import com.wechat.restaurant.entity.Collection;
import com.wechat.restaurant.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    @RequestMapping("/findAllCollection")
    @ResponseBody
    public List<Collection> findAllCollection() {
        return collectionService.searchAllCollection();
    }

    @RequestMapping("/saveCollection")
    @ResponseBody
    public Collection saveCollection(@RequestParam String productId) {
        return collectionService.saveCollection(productId);
    }

    @RequestMapping("/deleteCollection")
    @ResponseBody
    public void deleteCollection(@RequestParam String productId) {
        collectionService.deleteCollection(productId);
    }
}

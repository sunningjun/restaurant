package com.wechat.restaurant.service;

import com.wechat.restaurant.dto.SearchAllResult;
import com.wechat.restaurant.entity.Category;
import com.wechat.restaurant.entity.Collection;
import com.wechat.restaurant.entity.Product;
import com.wechat.restaurant.repository.CategoryRepository;
import com.wechat.restaurant.repository.CollectionRepository;
import com.wechat.restaurant.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

    public List<Collection> searchAllCollection() {
        return collectionRepository.findAll();
    }

    public Collection saveCollection(String productId) {
        Product product = new Product();
        product.setId(Integer.parseInt(productId));
        Collection collection = new Collection(product);
        return collectionRepository.saveAndFlush(collection);
    }
    @Transactional
    public Boolean deleteCollection(String productId) {
        if(collectionRepository.deleteByProductId(Integer.parseInt(productId))>0){
            return true;
        }
         return false;
    }

}

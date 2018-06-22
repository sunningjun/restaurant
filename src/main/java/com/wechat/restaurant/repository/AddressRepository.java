package com.wechat.restaurant.repository;

import com.wechat.restaurant.entity.Address;
import com.wechat.restaurant.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}

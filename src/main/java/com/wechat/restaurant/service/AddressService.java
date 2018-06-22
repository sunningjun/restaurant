package com.wechat.restaurant.service;

import com.wechat.restaurant.dto.AddressRequest;
import com.wechat.restaurant.entity.Address;
import com.wechat.restaurant.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> searchAllAddress() {
        return addressRepository.findAll();
    }

    public Address saveAddress(Address address) {
//            Address address=new Address(addressRequest.getName())
        return  addressRepository.save(address);
    }
//    @Transactional
//    public Boolean deleteAddress(String productId) {
//        if(addressRepository.deleteByProductId(Integer.parseInt(productId))>0){
//            return true;
//        }
//         return false;
//    }

}

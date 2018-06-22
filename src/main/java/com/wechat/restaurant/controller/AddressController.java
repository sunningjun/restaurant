package com.wechat.restaurant.controller;

import com.wechat.restaurant.dto.AddressRequest;
import com.wechat.restaurant.entity.Address;
import com.wechat.restaurant.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @ResponseBody
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Boolean saveAddress(@RequestBody Address address){
        if(addressService.saveAddress(address)!=null){
            return true;
        }
        return false;
    }
    @ResponseBody
    @GetMapping(value = "/findAll")
    public List<Address> findAll(){
        return addressService.searchAllAddress();
    }
}

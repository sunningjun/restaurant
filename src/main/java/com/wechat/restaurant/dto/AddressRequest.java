package com.wechat.restaurant.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    private String name;
    private int phone;
    private String address;
    private String user;
}

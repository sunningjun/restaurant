package com.wechat.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id_")
    private int id;
    @Column(name = "name_")
    private String name;
    @Column(name = "price_")

    private String price;
    @Column(name = "image_")

    private String image;

}

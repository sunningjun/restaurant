package com.wechat.restaurant.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "product")
@Inheritance(strategy =InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_")
    private int id;
    @Column(name = "name_")
    private String name;
    @Column(name = "price_")

    private String price;
    @Column(name = "image_")

    private String image;
    @Column(name = "category_")

    private String category;
    @Column(name = "description_")

    private String description;
}

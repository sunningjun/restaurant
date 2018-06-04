package com.wechat.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id_")
    private int id;
    @Column(name = "name_")
    private String name;
    @Column(name = "ui_name_")
    private String uiName;
}

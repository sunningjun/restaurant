package com.wechat.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Address {
    @Id
    @Column(name = "id_")
    @GeneratedValue(strategy = GenerationType.TABLE, generator="pk_gen")
    @TableGenerator(name = "pk_gen",
            table="tb_generator",
            pkColumnName="gen_name",
            valueColumnName="gen_value",
            pkColumnValue="PAYABLEMOENY_PK",
            allocationSize=100
    )
    private int id;
    @Column(name = "name_")
    private String name;
    @Column(name = "phone_")
    private String phone;
    @Column(name = "province_")
    private String province;
    @Column(name = "city_")
    private String city;
    @Column(name = "reigion_")
    private String reigion;
    @Column(name = "detail_")
    private String detail;
    @Column(name = "user_")
    private String user;


}

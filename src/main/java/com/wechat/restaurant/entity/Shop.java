package com.wechat.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Shop")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_")
    private int id;
    @Column(name = "name_")
    private String name;
    @Column(name = "note_")
    private String note;
    @Column(name = "address_")
    private String address;
    @Column(name = "phone_")
    private String phone;
    @Column(name = "date_")
    private String date;
    @Column(name = "time_")
    private String time;
    @Column(name = "send_up_limit")
    private int sendUpLimit;
    @Column(name = "take_out_price_")
    private int takeOutPrice;
}

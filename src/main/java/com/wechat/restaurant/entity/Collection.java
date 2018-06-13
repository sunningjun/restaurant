package com.wechat.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "collection")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Collection {
    private int id;
    private Product product;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_")
    public int getId() {
        return id;
    }
    @OneToOne(targetEntity = Product.class
            ,cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public Collection(Product product) {
        this.product = product;
    }
}

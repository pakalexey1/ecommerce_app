package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class CartItem extends BaseEntity{

    private Integer quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Cart cart;

}

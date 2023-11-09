package com.ecommerce.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Product extends BaseEntity {

    private String name;
    private int price;
    private int quantity;
    private int remainingQuantity;

    @ManyToMany
    @JoinTable(name="product_category_rel",
    joinColumns = @JoinColumn(name="p_id"),
    inverseJoinColumns = @JoinColumn(name="c_id"))
    private List<Category> category;
}

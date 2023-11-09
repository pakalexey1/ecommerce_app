package com.ecommerce.entity;


import com.ecommerce.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;
}

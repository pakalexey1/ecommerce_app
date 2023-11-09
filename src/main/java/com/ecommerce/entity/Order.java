package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
@Table(name="orders")
public class Order extends BaseEntity{

    private BigDecimal paid_price;
    private BigDecimal total_price;

    @OneToOne
    private Payment payment;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;
}

package com.ecommerce.entity;

import com.ecommerce.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Discount extends BaseEntity{

    private BigDecimal discount;
    private String name;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}

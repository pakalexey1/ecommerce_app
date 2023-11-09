package com.ecommerce.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Balance extends BaseEntity{


    private BigDecimal amount;

    @OneToOne
    private Customer customer;
}

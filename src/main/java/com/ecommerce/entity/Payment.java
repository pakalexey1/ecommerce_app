package com.ecommerce.entity;

import com.ecommerce.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Payment extends BaseEntity{

    private BigDecimal paidPrice;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}

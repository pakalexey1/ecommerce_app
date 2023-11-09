package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Customer extends BaseEntity{


    private String firstName;
    private String lastName;
    private String userName;
    private String email;


}

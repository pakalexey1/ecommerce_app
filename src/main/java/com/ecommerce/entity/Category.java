package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity {

    private String name;
}

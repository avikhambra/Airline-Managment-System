package com.example.ecom.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class OrderDetail extends BaseModel{
    @ManyToOne
    private Order order;
    @OneToOne
    private Product product;
    private int quantity;
}

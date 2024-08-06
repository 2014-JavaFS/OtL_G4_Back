package com.revature.OTL.car;

import java.util.List;

import com.revature.OTL.cart.Cart;
import com.revature.OTL.enums.Condition;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String make;
    private String colour;
    private String model;
    private int year;
    private String trim;
    private double price;
    private String description;

    @Enumerated(EnumType.STRING)
    private Condition condition;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Cart> carts;
}

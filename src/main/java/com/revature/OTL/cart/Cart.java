package com.revature.OTL.cart;

import java.time.LocalDateTime;

import com.revature.OTL.car.Car;
import com.revature.OTL.user.AppUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private LocalDateTime orderDate;
    private double totalPrice;
    private LocalDateTime EstDel;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private AppUser user;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Car car;

    private String Description;
}

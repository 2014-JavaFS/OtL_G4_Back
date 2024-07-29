package com.revature.OTL.car;

import com.revature.OTL.User.User;
import jakarta.persistence.*;
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
    private User seller;
    private String description;

    @Enumerated(EnumType.STRING)
    private Condition condition;
}


    enum Condition {
}

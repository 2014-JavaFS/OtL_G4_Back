package com.revature.otl.car;

import com.revature.otl.user.User;
import com.revature.otl.enums.Condition;
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
    private String description;

    @Enumerated(EnumType.STRING)
    private Condition condition;
}



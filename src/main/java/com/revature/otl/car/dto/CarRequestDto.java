package com.revature.otl.car.dto;

import com.revature.otl.user.User;
import com.revature.otl.car.Car;
import com.revature.otl.enums.Condition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarRequestDto {

    private String model;
    private String make;
    private String colour;
    private int year;
    private String trim;
    private double price;
    private User seller;
    private String description;
    private Condition condition;



    public static Car dtoToEntity(CarRequestDto carRequestDto){
        return Car.builder()
                .model(carRequestDto.getModel())
                .make(carRequestDto.getMake())
                .colour(carRequestDto.getColour())
                .year(carRequestDto.getYear())
                .trim(carRequestDto.getTrim())
                .price(carRequestDto.getPrice())
                .description(carRequestDto.getDescription()).condition(carRequestDto.getCondition()).build();
    }
}

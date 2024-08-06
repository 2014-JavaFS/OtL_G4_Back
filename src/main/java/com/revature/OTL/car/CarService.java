package com.revature.OTL.car;

import java.util.List;

import com.revature.OTL.car.dto.CarRequestDto;

public interface CarService {

    Car create(CarRequestDto carRequestDto);

    List<CarRequestDto> getAllCars();

    Car getCarById(int id);

    void deleteCar(int id);

    Car updateCar(int id, CarRequestDto requestDto);
}

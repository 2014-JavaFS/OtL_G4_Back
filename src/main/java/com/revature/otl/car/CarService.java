package com.revature.otl.car;

import com.revature.otl.car.dto.CarRequestDto;

import java.util.List;

public interface CarService {


    Car create(CarRequestDto carRequestDto);

    List<Car> getAllCars();

    Car getCarById(int id);

    void deleteCar(int id);

    Car updateCar(int id, CarRequestDto requestDto);
}

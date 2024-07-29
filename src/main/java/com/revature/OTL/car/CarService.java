package com.revature.OTL.car;

import com.revature.OTL.car.dto.CarRequestDto;

import java.util.List;
import java.util.Optional;

public interface CarService {


    Car create(CarRequestDto carRequestDto);

    List<Car> getAllCars();

    Car getCarById(int id);

    void deleteCar(int id);

    Car updateCar(int id, CarRequestDto requestDto);
}

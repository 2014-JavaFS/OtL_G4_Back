package com.revature.OTL.car.impl;

import com.revature.OTL.car.Car;
import com.revature.OTL.car.CarRepository;
import com.revature.OTL.car.CarService;
import com.revature.OTL.car.dto.CarRequestDto;
import com.revature.OTL.util.exceptions.DataNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CarServiceImpl implements CartService {

    private final CartRepository carRepository;

    @Autowired
    public CarServiceImpl(CartRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
        

    return carRepository.save (CarRequestDto.dtoToEntity

(carRequestDto));
    }

    @Override
public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
public Car getCarById(int id) {
        return carRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Nothing in the database with ID of " + id));
    }
           
    @Override
public void deleteCar(int id) {
        carRepository.deleteById(id);
    }

    @Override
public Car updateCar(int id, CarRequestDto requestDto) {
        return null;
    }

}

package com.CarRental.CarRental.repository;

import com.CarRental.CarRental.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}

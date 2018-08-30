package com.CarRental.CarRental.repository;

import com.CarRental.CarRental.model.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTypeRepository extends JpaRepository<CarType,Long> {
}

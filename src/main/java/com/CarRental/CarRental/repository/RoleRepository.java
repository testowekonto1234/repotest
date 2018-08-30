package com.CarRental.CarRental.repository;

import com.CarRental.CarRental.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
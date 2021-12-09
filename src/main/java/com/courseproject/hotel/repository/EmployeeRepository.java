package com.courseproject.hotel.repository;

import com.courseproject.hotel.model.EmployeeModel;
import com.courseproject.hotel.model.GuestModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

    Optional<EmployeeModel> findByUsername(String username);
}

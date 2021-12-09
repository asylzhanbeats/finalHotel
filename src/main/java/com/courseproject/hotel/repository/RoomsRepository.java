package com.courseproject.hotel.repository;

import com.courseproject.hotel.model.RoomsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomsRepository extends JpaRepository<RoomsModel, String> {

}

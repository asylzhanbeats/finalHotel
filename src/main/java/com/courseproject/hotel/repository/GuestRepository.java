package com.courseproject.hotel.repository;

import com.courseproject.hotel.model.GuestModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuestRepository extends JpaRepository<GuestModel, Integer> {

    Optional<GuestModel> findByUsername(String username);
}

package com.courseproject.hotel.repository;

import com.courseproject.hotel.ReservationId;
import com.courseproject.hotel.model.ReservationsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationsRepository extends JpaRepository<ReservationsModel, ReservationId> {
    Optional<ReservationsModel> findByGid(Integer gid);
    Optional<ReservationsModel> findByGidAndRoomNumber(Integer gid, String roomNumber);
}

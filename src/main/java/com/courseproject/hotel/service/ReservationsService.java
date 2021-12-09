package com.courseproject.hotel.service;

import com.courseproject.hotel.model.ReservationsModel;
import com.courseproject.hotel.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ReservationsService {

    private final ReservationsRepository reservationsRepository;

    public ReservationsService(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    public ReservationsModel createReservation(Integer gid, String roomNumber, Date checkIn, Date checkOut) {
        if (gid == null || roomNumber == null || checkIn == null || checkOut == null)
            return null;
        else {
            ReservationsModel reservationsModel = new ReservationsModel();
            reservationsModel.setGid(gid);
            reservationsModel.setRoomNumber(roomNumber);
            reservationsModel.setCheckIn(checkIn);
            reservationsModel.setCheckOut(checkOut);
            return reservationsRepository.save(reservationsModel);
        }
    }

    // NOT SURE ABOUT THIS ONE
    public ReservationsModel allReservations(Integer gid) {
        return reservationsRepository.findByGid(gid).orElse(null);
    }

    public void cancelReservation(Integer gid, String roomNumber) {

    }

    // public ReservationsModel changeReservation();


}

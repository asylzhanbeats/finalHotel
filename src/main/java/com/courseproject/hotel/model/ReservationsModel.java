package com.courseproject.hotel.model;


import com.courseproject.hotel.ReservationId;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "reservation")
@IdClass(ReservationId.class)
public class ReservationsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DO WE NEED THIS?
    Integer gid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DO WE NEED THIS?
    String roomNumber;

    Date checkIn;
    Date checkOut;
    Boolean isOccupied;
    Boolean isClean;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Boolean getClean() {
        return isClean;
    }

    public void setClean(Boolean clean) {
        isClean = clean;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationsModel that = (ReservationsModel) o;
        return Objects.equals(gid, that.gid) && Objects.equals(roomNumber, that.roomNumber) && Objects.equals(checkIn, that.checkIn) && Objects.equals(checkOut, that.checkOut) && Objects.equals(isOccupied, that.isOccupied) && Objects.equals(isClean, that.isClean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, roomNumber, checkIn, checkOut, isOccupied, isClean);
    }

    @Override
    public String toString() {
        return "ReservationsModel{" +
                "gid=" + gid +
                ", roomNumber='" + roomNumber + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", isOccupied=" + isOccupied +
                ", isClean=" + isClean +
                '}';
    }
}
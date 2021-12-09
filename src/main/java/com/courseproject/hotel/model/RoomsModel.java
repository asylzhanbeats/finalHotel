package com.courseproject.hotel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "room")
public class RoomsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String roomNumber;

    String roomType;
    Integer roomSize;
    Integer capacity;
    Integer roomFloor;
    Float price;
    Integer gid;
    Integer hid;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Integer roomSize) {
        this.roomSize = roomSize;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(Integer roomFloor) {
        this.roomFloor = roomFloor;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomsModel that = (RoomsModel) o;
        return Objects.equals(roomNumber, that.roomNumber) && Objects.equals(roomType, that.roomType) && Objects.equals(roomSize, that.roomSize) && Objects.equals(capacity, that.capacity) && Objects.equals(roomFloor, that.roomFloor) && Objects.equals(price, that.price) && Objects.equals(gid, that.gid) && Objects.equals(hid, that.hid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomType, roomSize, capacity, roomFloor, price, gid, hid);
    }

    @Override
    public String toString() {
        return "RoomsModel{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomSize=" + roomSize +
                ", capacity=" + capacity +
                ", roomFloor=" + roomFloor +
                ", price=" + price +
                ", gid=" + gid +
                ", hid=" + hid +
                '}';
    }
}

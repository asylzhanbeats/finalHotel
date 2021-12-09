package com.courseproject.hotel;

import java.io.Serializable;
import java.util.Objects;

public class ReservationId implements Serializable {
    private Integer gid;
    private String roomNumber;

    public ReservationId(Integer id, String number) {
        gid = id;
        roomNumber = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationId that = (ReservationId) o;
        return Objects.equals(gid, that.gid) && Objects.equals(roomNumber, that.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, roomNumber);
    }
}

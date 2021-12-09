package com.courseproject.hotel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="guest")
public class GuestModel {
//    CREATE TABLE IF NOT EXISTS Guest(
//            gid INT PRIMARY KEY,
//            username VARCHAR(20) UNIQUE,
//            password VARCHAR(128),
//            id_type VARCHAR(20),
//            id_number VARCHAR(15),
//            guest_address address,
//            home_phone phone,
//            mobile_phone phone
//);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    private String username;
    private String password;
    private String id_type;
    private String id_number;
    private String guest_address;
    private String home_phone;
    private String mobile_phone;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getGuest_address() {
        return guest_address;
    }

    public void setGuest_address(String guest_address) {
        this.guest_address = guest_address;
    }

    public String getHome_phone() {
        return home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestModel that = (GuestModel) o;
        return Objects.equals(gid, that.gid) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(id_type, that.id_type) && Objects.equals(id_number, that.id_number) && Objects.equals(guest_address, that.guest_address) && Objects.equals(home_phone, that.home_phone) && Objects.equals(mobile_phone, that.mobile_phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, username, password, id_type, id_number, guest_address, home_phone, mobile_phone);
    }

    @Override
    public String toString() {
        return "GuestModel{" +
                "gid=" + gid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id_type='" + id_type + '\'' +
                ", id_number='" + id_number + '\'' +
                ", guest_address='" + guest_address + '\'' +
                ", home_phone='" + home_phone + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                '}';
    }
}

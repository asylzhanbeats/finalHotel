package com.courseproject.hotel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class EmployeeModel {
//    CREATE TABLE IF NOT EXISTS Employee(
//            username VARCHAR(20) UNIQUE,
//    password VARCHAR(128),
//    eid INT PRIMARY KEY,
//    name VARCHAR(30),
//    surname VARCHAR(40),
//    phone_number phone,
//    employee_address address,
//    job_type VARCHAR(20),
//    hid INT,
//    FOREIGN KEY(hid) REFERENCES Hotel(hid)
//            );
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer eid;
        private String username;
        private String password;
        private String name;
        private String surname;
        private String employee_address;
        private String job_type;
        private String mobile_phone;
        private Integer hid;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
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
        EmployeeModel that = (EmployeeModel) o;
        return Objects.equals(eid, that.eid) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(employee_address, that.employee_address) && Objects.equals(job_type, that.job_type) && Objects.equals(mobile_phone, that.mobile_phone) && Objects.equals(hid, that.hid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, username, password, name, surname, employee_address, job_type, mobile_phone, hid);
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "eid=" + eid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employee_address='" + employee_address + '\'' +
                ", job_type='" + job_type + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", hid=" + hid +
                '}';
    }
}

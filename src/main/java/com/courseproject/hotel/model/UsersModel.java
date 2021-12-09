package com.courseproject.hotel.model;

import org.apache.catalina.User;

public class UsersModel {
    private final GuestModel guestModel;
    private final EmployeeModel employeeModel;

    public UsersModel(GuestModel guestModel, EmployeeModel employeeModel){
        this.guestModel = guestModel;
        this.employeeModel = employeeModel;
    }

    public GuestModel getGuestModel() {
        return guestModel;
    }

    public EmployeeModel getEmployeeModel() {
        return employeeModel;
    }
}

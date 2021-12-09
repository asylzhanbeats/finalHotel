package com.courseproject.hotel.service;

import com.courseproject.hotel.model.EmployeeModel;
import com.courseproject.hotel.model.GuestModel;
import com.courseproject.hotel.model.UsersModel;
import com.courseproject.hotel.repository.EmployeeRepository;
import com.courseproject.hotel.repository.GuestRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {


    private final GuestRepository guestRepository;
    private final EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;

    public UsersService(GuestRepository guestRepository, EmployeeRepository employeeRepository){
        this.guestRepository = guestRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.employeeRepository = employeeRepository;
    }
    public GuestModel registerUser(String username, String password){
        if (username != null && password !=null){
            GuestModel guestModel = new GuestModel();
            guestModel.setUsername(username);
            guestModel.setPassword(passwordEncoder.encode(password));
            return guestRepository.save(guestModel);
        }
        return null;
    }

    public UsersModel authenticate(String username, String password){
        GuestModel guestModel = guestRepository.findByUsername(username).orElse(null);
        if (guestModel!=null && passwordEncoder.matches(password,guestModel.getPassword())){
            return new UsersModel(guestModel,null);
        }
        EmployeeModel employeeModel = employeeRepository.findByUsername(username).orElse(null);
        if (employeeModel!=null && passwordEncoder.matches(password,employeeModel.getPassword())){
            return new UsersModel(null,employeeModel);
        }
        return null;
    }
}

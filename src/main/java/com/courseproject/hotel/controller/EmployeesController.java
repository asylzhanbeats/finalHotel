package com.courseproject.hotel.controller;

import com.courseproject.hotel.model.EmployeeModel;
import com.courseproject.hotel.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeesController {

//    @Autowired
//    private EmployeesService employeesService;
//
//    @RequestMapping("/")
//    public String AllEmployees(Model model) {
//        List<EmployeesModel> listEmployees = employeesService.listAll();
//        model.addAttribute("listEmployees", listEmployees);
//
//        return "manager";
//    }

}

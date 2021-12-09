package com.courseproject.hotel.controller;

import com.courseproject.hotel.model.EmployeeModel;
import com.courseproject.hotel.model.GuestModel;
import com.courseproject.hotel.model.LoginModel;
import com.courseproject.hotel.model.UsersModel;
import com.courseproject.hotel.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model){
        model.addAttribute("registerRequest", new GuestModel());
        return "register_page";
    }
    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("loginRequest", new GuestModel());
        return "login_page";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute GuestModel guestModel){
        System.out.println("register request: "+ guestModel);
        GuestModel registeredGuest = usersService.registerUser(guestModel.getUsername(),guestModel.getPassword());
        return registeredGuest == null ? "error_page" : "redirect:/login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute LoginModel loginModel, Model model){
        System.out.println("login request: "+ loginModel);
        UsersModel authenticatedUser = usersService.authenticate(loginModel.getUsername(),loginModel.getPassword());

        if (authenticatedUser.getGuestModel()!=null){
            return "profile_page";
        }
        if (authenticatedUser.getEmployeeModel()!=null) {
            EmployeeModel employeeModel = authenticatedUser.getEmployeeModel();
            if (employeeModel.getJob_type()=="clerk"){
                return "clerk_page";
            }
            if (employeeModel.getJob_type()=="manager"){
                return "manager_page";
            }
        }
        return "error_page";
    }
}

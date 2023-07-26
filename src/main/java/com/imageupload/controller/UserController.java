package com.imageupload.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imageupload.dto.UserDomain;
import com.imageupload.service.UserService;

@Controller
@RequestMapping("/v1")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @ModelAttribute("user")
    public UserDomain userDomain() {
        return new UserDomain();
    }
    
    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String addUser(@ModelAttribute("user") UserDomain userDomain) {
        userService.addUser(userDomain);
        return "redirect:/v1?success";
    }
}

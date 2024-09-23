package com.pedrom.course.springboot.webapp.springboot_web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pedrom.course.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User( "Pedro", "Mereles");
        model.addAttribute("title", "Hello World");
        model.addAttribute("user", user);
        //  model.addAttribute("name", "Pedro");
        //  model.addAttribute("lastName", "Mereles");

        return "details";
    }
    

}

package com.pedrom.course.springboot.webapp.springboot_web.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pedrom.course.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User( "Pedro", "Mereles");
        user.setEmail("pedromereles83@gmail.com");
        model.addAttribute("title", "Hello World");
        model.addAttribute("user", user);
        //  model.addAttribute("name", "Pedro");
        //  model.addAttribute("lastName", "Mereles");

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        /*List<User> users = Arrays.asList(
             new User("juan", "perez"),
             new User("pepe", "cardozo"),
             new User("juan", "Aguilar", "licenciadoaguiar@cmal.com")
             );*/
      
        model.addAttribute("title", "Listado usuarios");
       // model.addAttribute("users", users);

        return "list";

    }

    @ModelAttribute("users")
    public List<User> userModel(){
        List<User> users = Arrays.asList(
        new User("juan", "perez"),
        new User("pepe", "cardozo"),
        new User("juan", "Aguilar", "licenciadoaguiar@cmal.com")
        );

        return users;
    }
    

}

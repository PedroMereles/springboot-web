package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details( Map<String, Object> model ) {
        model.put("title", "Hello World");
        model.put("name", "Pedro");
        model.put("lastName", "Mereles");

        return "details";

    }
    
    @GetMapping("/details1")
    public String details1(Model model ) {
        model.addAttribute("title", "Hello World");
        model.addAttribute("name", "Pedro");
        model.addAttribute("lastName", "Mereles");

        return "details1";

    }
    

}

package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pedrom.course.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    //@RequestMapping(path = "/details", method = RequestMethod.GET)
    @GetMapping( "/details")
    public Map<String, Object> details( ) {
        
      User user = new User( "Pedro", "Mereles");
        
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World");
        body.put("user", user);

        //body.put("name", "Pedro");
        //body.put("lastName", "Mereles");

        return body;
    }


    /*
    @RequestMapping("/details1")
    public String details1(Model model ) {
        model.addAttribute("title", "Hello World");
        model.addAttribute("name", "Pedro");
        model.addAttribute("lastName", "Mereles");

        return "details1";

    }*/
    

}

package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrom.course.springboot.webapp.springboot_web.models.User;
import com.pedrom.course.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    // @RequestMapping(path = "/details", method = RequestMethod.GET)
    @GetMapping("/details")
    //Utiliando DTO
    public UserDto details() {

        //Creacion de userDto
        UserDto userDto = new UserDto();

        User user = new User("Pedro", "Mereles");
        userDto.setUser(user);
        userDto.setTitle("Hello World");

        return userDto;
    }

    //Utiliando MAP
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Pedro", "Mereles");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World");
        body.put("user", user);

        // body.put("name", "Pedro");
        // body.put("lastName", "Mereles");
        return body;
    }

   
    @GetMapping("/list")
    public List<User> userList() {

        User user = new User("Pedro", "Mereles");
        User user2 = new User("Juan", "Frutos");
        User user3 = new User("Lucas", "Duarte");

        //List<User> users = new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        List<User> users = Arrays.asList(user, user2, user3);
        
        return users;

    }

    /*
     * @RequestMapping("/details1")
     * public String details1(Model model ) {
     * model.addAttribute("title", "Hello World");
     * model.addAttribute("name", "Pedro");
     * model.addAttribute("lastName", "Mereles");
     * 
     * return "details1";
     * 
     * }
     */
}

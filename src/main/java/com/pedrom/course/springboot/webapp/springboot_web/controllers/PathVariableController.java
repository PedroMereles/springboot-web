package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrom.course.springboot.webapp.springboot_web.models.User;
import com.pedrom.course.springboot.webapp.springboot_web.models.dto.ParamDto;




@RestController
@RequestMapping("/api/var")
 public class PathVariableController {


    @GetMapping("/baz/{message}")
    public ParamDto baz( @PathVariable String message) {

        ParamDto param = new ParamDto();

        param.setMessage(message);
        return param;
    }

        //Rquest con mas de un path
    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar( @PathVariable String product, @PathVariable Long id) {
        
        Map<String, Object> json = new HashMap<>();
        json.put("product", product );        
        json.put("id", id);
        return json;
    }
    
    
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // se debe de realizar algun movmiento, puede ser un save en bd   
        
        user.setName(user.getName().toUpperCase());
        return user;
    }
    
    
}

package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pedrom.course.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.pedrom.course.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required=false, defaultValue="Hi") String message ) {

        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
        
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);

        return params;
    }
    
    //request utilizando de forma nativa
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest  request) {

        ParamMixDto params = new ParamMixDto();
       
        Integer code = 0;
        try {

           code = Integer.parseInt(request.getParameter("code"));

        } catch (NumberFormatException e) {
        }


        params.setCode(code);
        params.setMessage(request.getParameter("message"));

        return params;
    }
    
    

}

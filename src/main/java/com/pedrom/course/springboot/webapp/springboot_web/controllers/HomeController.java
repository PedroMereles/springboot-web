package com.pedrom.course.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping({"","/", "/home"}) 
    public String home() {
        return "redirect:/list";
        //return "forward:/list";
    }
    /* 
    El redirect cambia la ruta, reinicia el requesst y refresca la pagina, ademas los parametros del request
    se pierden con la nueva consulta
    forward: mantiene la peticion http y no pierde los parametros 
    dentro del request y tampoco cambia la ruta ya que no realiza un refresh de la pagina*/
    
}

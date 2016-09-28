package de.rbaradari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Success! The microservice component is up and running";
    }

}

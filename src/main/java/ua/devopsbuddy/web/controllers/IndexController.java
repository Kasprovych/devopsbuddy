package ua.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rostyslav Kasprovych
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}

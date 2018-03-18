package ua.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.devopsbuddy.web.domain.frontend.FeedbackPojo;

/**
 * @author Rostyslav Kasprovych
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about(){
        return "copy/about";
    }

}

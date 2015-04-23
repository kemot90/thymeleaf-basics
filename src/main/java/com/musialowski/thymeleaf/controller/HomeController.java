package com.musialowski.thymeleaf.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Tomasz Musiałowski <tomasz@musialowski.com>
 */
@Controller
public class HomeController {

    private String greatings = "Hello Thymeleaf";

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String home() {
        return "home";
    }

    @ModelAttribute("greatings")
    public String getGreatings() {
        return greatings;
    }
}
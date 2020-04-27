package co.covid19.covid19tracker.controllers;

import co.covid19.covid19tracker.services.Covid19DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    Covid19DataService covid19DataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", covid19DataService.getAllStats());
        return "home";
    }
}

package thao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homes")
public class HomeController {
    @GetMapping("")
    public String showIndex(){
        return "/index";
    }
}

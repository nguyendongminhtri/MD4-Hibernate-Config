package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import services.Cusromer2Service;
import services.CustomerServiec;
@Controller
public class ControllerDemo {
    @Autowired
    Cusromer2Service customerServiec;

    @GetMapping("/customers")
    public ModelAndView listCustomers(){
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customerServiec.findAll());
        return modelAndView;
    }
}

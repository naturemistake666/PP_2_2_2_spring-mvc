package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    public CarService carService;

    @GetMapping("/car")
    public String sayCar(ModelMap model,@RequestParam(value = "count") Optional<Integer> count) {

        model.addAttribute("cars", carService.getCar(count.orElse(0)));
        return "car";
    }
}

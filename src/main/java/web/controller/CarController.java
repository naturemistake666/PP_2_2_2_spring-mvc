package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {
    public final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String sayCar(ModelMap model,@RequestParam(value = "count") Optional<Integer> count) {

        model.addAttribute("cars", carService.getCar(count.orElse(0)));
        return "car";
    }
}

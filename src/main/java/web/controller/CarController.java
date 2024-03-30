package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;



@Controller
public class CarController {

    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {

        model.addAttribute("cars",carService.carsCount(allCars));
        return "cars";
    }
}

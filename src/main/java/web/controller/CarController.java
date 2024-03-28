package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMV", "Blue", 415));
        list.add(new Car("Mersedes", "White", 180));
        list.add(new Car("Lada", "Green", 2407));
        list.add(new Car("Mazda", "Black", 5));
        list.add(new Car("Mitsubisi", "Silver", 9));
        list = CarServiceImpl.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "cars";
    }
}

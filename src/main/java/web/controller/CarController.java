package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.servise.CarService;

import java.util.List;


@Controller
public class CarController {

    private final CarService carService;
    private final CarDao carDao;

    public CarController(CarService carService, CarDao carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> carList = carService.carsCount(allCars, carDao.InitCar());
        model.addAttribute("cars", carList);
        return "cars";
    }
}

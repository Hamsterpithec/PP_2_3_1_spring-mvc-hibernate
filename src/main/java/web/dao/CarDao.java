package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public class CarDao {


    Car car1 = new Car("BMV", "Blue", 415);
    Car car2 = new Car("Mersedes", "White", 180);
    Car car3 = new Car("Lada", "Green", 2407);
    Car car4 = new Car("Mazda", "Black", 5);
    Car car5 = new Car("Mitsubisi", "Silver", 9);

    public List<Car> initCar() {
        return List.of(car1, car2, car3, car4, car5);
    }


}

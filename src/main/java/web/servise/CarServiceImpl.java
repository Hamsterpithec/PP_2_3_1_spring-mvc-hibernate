package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {


    public List<Car> carsCount(int number, List<Car> carList) {
        List<Car> result;
        if (number == 0 || number > 5) {
            result = carList;
        } else {
            result = carList.stream().limit(number).collect(Collectors.toList());
        }
        return result;
    }


}

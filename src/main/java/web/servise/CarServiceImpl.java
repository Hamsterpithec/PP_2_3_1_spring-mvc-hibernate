package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carsCount(int number, List<Car> carList) {
        if (number == 0 || number > 5) return carList;
        return carList.stream().limit(number).collect(Collectors.toList());
    }


}

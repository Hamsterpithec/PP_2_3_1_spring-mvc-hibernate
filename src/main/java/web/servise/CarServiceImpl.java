package web.servise;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> carsCount(int number) {
        List<Car> carlist = carDao.InitCar();
        if (number > 5) {
            return carlist;
        }
        return carlist.stream().limit(number).collect(Collectors.toList());
    }
}

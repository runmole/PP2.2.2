package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServicelmpl implements CarService {

    @Override
    public List<Car> carsCount(int num) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Lada", "14", 485));
        list.add(new Car("BMW", "M5", 382));
        list.add(new Car("Nissan", "NX", 288));
        list.add(new Car("Mazda", "3", 888));
        list.add(new Car("Niva", "XXL", 477));

        if (num == 0 || num > 5)
            return list;
        return list.stream().limit(num).collect(Collectors.toList());

    }



}

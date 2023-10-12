package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarServicelmpl implements CarService {

    private List<Car> list = new ArrayList<>();
    public  List<Car> carList () {

        list.add(new Car("Lada", "14", 485));
        list.add(new Car("BMW", "M5", 382));
        list.add(new Car("Nissan", "NX", 288));
        list.add(new Car("Mazda", "3", 888));
        list.add(new Car("Niva", "XXL", 477));
        return list;

    }

    @Override
    public List<Car> carsCount(List<Car> list, int num) {
        if (num == 0 || num > 5)
            return list;
        return list.stream().limit(num).collect(Collectors.toList());

    }



}

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServicelmpl;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServicelmpl carServicelmpl;

    public CarController(CarServicelmpl carServicelmpl) {
        this.carServicelmpl = carServicelmpl;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> carList = new ArrayList<>(carServicelmpl.carList());
        carList = carServicelmpl.carsCount(carList, count);
        model.addAttribute("list", carList);
        return "cars";
    }
}

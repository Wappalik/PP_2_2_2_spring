package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String allCars(ModelMap model) {
        List<Car> cars = carService.getAllCars(5);
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping(value = "/cars", params = "count")
    public String fewCars (@RequestParam (value = "count") int number, ModelMap modelMap) {
        List<Car> cars = carService.getAllCars(number);
        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}


//    @GetMapping("/cars")
//    public String viewAllCars (@RequestParam(value = "count") int chislo, ModelMap model) {
//        List<Car> cars = carService.getAllCars(chislo);
//        model.addAttribute("cars", cars);
//        return "cars";
//    }
//    @GetMapping("/cars")
//    public String viewTwoCars (@RequestParam (value = "count") int kolichestvo, ModelMap model) {
//        List<Car> cars = carService.getAllCars(kolichestvo);
//        model.addAttribute("cars", cars);
//        return "cars";
//    }
//    @GetMapping("/cars?count=3")
//    public String viewThreeCars (@RequestParam (value = "count") int kolichestvo, ModelMap model) {
//        List<Car> cars = carService.getAllCars(kolichestvo);
//        model.addAttribute("cars", cars);
//        return "cars";
//    }


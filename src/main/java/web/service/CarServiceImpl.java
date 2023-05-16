package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getAllCars(int id) {
        List <Car> cars = new ArrayList<>();
        Car car1 = new Car("Audi","A8",23544);
        Car car2 = new Car("BMW","A8",1234);
        Car car3 = new Car("MERCEDEC","A8",14444);
        Car car4 = new Car("KIA","A8",6165);
        Car car5 = new Car("ZHIGULI","A8",1234);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars.stream().limit(id).toList();
    }
}

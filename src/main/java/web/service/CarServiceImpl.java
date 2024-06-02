package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "model1", "red"));
        cars.add(new Car(2, "model2", "blue"));
        cars.add(new Car(3, "model3", "green"));
        cars.add(new Car(4, "model4", "white"));
        cars.add(new Car(5, "model5", "black"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }


    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}

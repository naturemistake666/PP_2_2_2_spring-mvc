package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> car = new ArrayList<>();

    static {
        car.add(new Car("Car1", 55, 4152123.1));
        car.add(new Car("Car2", 56, 5152123.1));
        car.add(new Car("Car3", 57, 6152123.1));
        car.add(new Car("Car4", 58, 7152123.1));
        car.add(new Car("Car5", 59, 8152123.1));
    }
    @Override
    public List<Car> getCar(int count) {
        if(count == 0) {
            return car;
        }
        return car.stream().limit(count).collect(Collectors.toList());
    }
}

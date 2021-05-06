package pl.pjatk.barkry;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CarService {

    private int carIdCount = 1;
    private List<Car> carList = new CopyOnWriteArrayList<>();

    public Car addCar(Car car){

        car.setId(carIdCount);
        carList.add(car);
        carIdCount++;
        return car;
    }

    public List<Car> getCars() {
        return carList;
    }

    public Car getCar(int CarId){
        return carList
                .stream()
                .filter(c -> c.getId() == CarId)
                .findFirst()
                .get();
    }

    public Car updateCar(int CarId, Car car) {
        carList
                .stream()
                .forEach(c -> {
                    if(c.getId() == CarId) {
                        c.setModel(car.getModel());
                    }
                });
        return carList
                .stream()
                .filter(c -> c.getId() == CarId)
                .findFirst()
                .get();
    }

    public void deleteCar(int CarId){
        carList
                .stream()
                .forEach(c -> {
                    if(c.getId() == CarId){
                        carList.remove(c);
                    }
                });
    }

}

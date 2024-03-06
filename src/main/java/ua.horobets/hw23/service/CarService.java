package ua.horobets.hw23.service;

import ua.horobets.hw23.dao.CarDao;
import ua.horobets.hw23.model.Car;

import java.util.List;

public class CarService {
    private final CarDao carDao = CarDao.getInstance();

    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    public Car getById(int id) {
        return carDao.getById(id);
    }

    public void deleteById(int id) {
        carDao.deleteById(id);
    }

    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }
}
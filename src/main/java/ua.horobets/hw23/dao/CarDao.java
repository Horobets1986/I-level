package ua.horobets.hw23.dao;



import ua.horobets.hw23.model.Car;

import java.util.ArrayList;
import java.util.List;

    public final class CarDao {
        private static final CarDao INSTANCE = new CarDao();
        private final List<Car> carList = new ArrayList<>();
        private int carIdCounter = 1;

        public static CarDao getInstance() {
            return INSTANCE;
        }

        private CarDao() {
        }

        public void saveCar(Car car) {
            car.setId(carIdCounter++);
            carList.add(car);
        }

        public Car getById(int id) {
            return carList.stream().filter(car -> car.getId() == id).findAny().orElse(null);
        }

        public void deleteById(int id) {
            Car carSearch = carList.stream().filter(car -> car.getId() == id).findAny().orElse(null);
            if (carSearch != null) {
                carList.remove(carSearch);
            }
        }

        public List<Car> getAllCar() {
            return new ArrayList<>(carList);
        }
    }


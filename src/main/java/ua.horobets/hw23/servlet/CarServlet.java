package ua.horobets.hw23.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.horobets.hw23.dao.CarDao;
import ua.horobets.hw23.model.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/car/*")
public class CarServlet extends HttpServlet {
    private final CarDao carDao = CarDao.getInstance();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getPathInfo();
        resp.setContentType("application/json");

        if (contextPath == null || contextPath.equals("/")) {
            List<Car> allCars = carDao.getAllCar();
            String json = objectMapper.writeValueAsString(allCars);
            resp.getWriter().println(json);
        } else {
            String[] pathParts = contextPath.split("/");
            if (pathParts.length == 2) {
                try {
                    int carId = Integer.parseInt(pathParts[1]);
                    Car car = carDao.getById(carId);
                    if (car != null) {
                        String json = objectMapper.writeValueAsString(car);
                        resp.getWriter().println(json);
                    } else {
                        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                        resp.getWriter().println("Car not found");
                    }
                } catch (NumberFormatException e) {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().println("Invalid car ID format");
                }
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().println("Invalid path format");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (BufferedReader bufferedReader = req.getReader()) {
            String json = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
            Car car = objectMapper.readValue(json, Car.class);
            carDao.saveCar(car);
            System.out.println(json);
        } catch (IOException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("Error reading request body");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getRequestURI();
        if (contextPath != null && contextPath.startsWith("/car/")) {
            try {
                int carId = Integer.parseInt(contextPath.substring("/car/".length()));

                boolean isCarInList = carDao.getAllCar().stream().anyMatch(car -> car.getId() == carId);

                if (isCarInList) {
                    carDao.deleteById(carId);
                    resp.setStatus(HttpServletResponse.SC_OK);
                    resp.getWriter().println("The car with ID " + carId + " was deleted.");
                } else {
                    resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    resp.getWriter().println("The car with ID " + carId + " not found..");
                }
            } catch (NumberFormatException e) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().println("Invalid format car ID.");
            }
        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("Invalid format path.");
        }
    }
}
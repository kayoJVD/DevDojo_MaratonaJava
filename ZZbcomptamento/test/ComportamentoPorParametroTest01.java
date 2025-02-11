package DevDojoExercicios.ZZbcomptamento.test;

import DevDojoExercicios.ZZbcomptamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("blue", 2015), new Car("green", 1998), new Car("black", 2000));

    public static void main(String[] args) {
        System.out.println(filterGreemCar(cars));
        System.out.println(filterCarByColor(cars, "blue"));
        System.out.println("------------------");
        System.out.println(filterByYearBefore(cars, 2016));

    }


    private static List<Car> filterGreemCar(List<Car> cars) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCars.add(car);
            }
        }

        return filterCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String collor) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(collor)) {
                filterCars.add(car);
            }
        }

        return filterCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCars.add(car);
            }
        }

        return filterCars;
    }
}

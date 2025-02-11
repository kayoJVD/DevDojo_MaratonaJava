package DevDojoExercicios.ZZbcomptamento.test;

import DevDojoExercicios.ZZbcomptamento.dominio.Car;
import DevDojoExercicios.ZZbcomptamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("blue", 2015), new Car("green", 1998), new Car("black", 2000));
        private static int year = 2020;
    public static void main(String[] args) {
//        List<Car> greenCar = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("blue"));
        List<Car>  yearBeforeCars = filter(cars, car -> car.getYear() < year);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filterCars.add(car);
            }
        }

        return filterCars;
    }
}

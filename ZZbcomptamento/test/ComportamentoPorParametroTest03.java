package DevDojoExercicios.ZZbcomptamento.test;

import DevDojoExercicios.ZZbcomptamento.dominio.Car;
import DevDojoExercicios.ZZbcomptamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("blue", 2015), new Car("green", 1998), new Car("black", 2000));
    private static int year = 2020;

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("blue"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < year);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterredList = new ArrayList<>();
        for (T t : filterredList) {
            if (predicate.test(t)){
                filterredList.add(t);
            }
        }
        return filterredList;
    }
}

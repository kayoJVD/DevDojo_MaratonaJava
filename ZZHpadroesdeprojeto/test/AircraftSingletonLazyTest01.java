package DevDojoExercicios.ZZHpadroesdeprojeto.test;

import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;
import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}

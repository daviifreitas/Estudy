package Javacore.ZZBcomportamento.test;

import Javacore.ZZBcomportamento.Interface.CarPredicate;
import Javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static  List<Car> cars = List.of(
            new Car("Green", 2011),
            new  Car("Black", 1998),
            new Car("Red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });

        List<Car> greenCars = filter(cars , car -> car.getColor().equals("Red"));
        List<Car> filteredYearBefore = filter(cars , car -> car.getYear() < 2015 );

        System.out.println(greenCars);
        System.out.println(filteredYearBefore);
    }
    private static List<Car> filter(List<Car> cars , CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
    
}

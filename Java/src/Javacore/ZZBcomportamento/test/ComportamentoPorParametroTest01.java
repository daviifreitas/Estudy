package Javacore.ZZBcomportamento.test;

import Javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static  List<Car> cars = List.of(
            new Car("Green", 2011),
            new  Car("Black", 1998),
            new Car("Red", 2019));


    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("Green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
    }
}

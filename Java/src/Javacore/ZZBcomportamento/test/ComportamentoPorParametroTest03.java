package Javacore.ZZBcomportamento.test;

import Javacore.ZZBcomportamento.Interface.CarPredicate;
import Javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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

        List<Integer> nums = List.of(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9);
        System.out.println(filter(nums, number -> number % 2 == 0));

        CarPredicate carpredicate = new CarPredicate(){

            @Override
            public boolean test(Car car) {
                return false;
            }
        };
    }
    private static <T> List<T> filter(List<T> list , Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
    
}

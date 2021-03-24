package SoftUniJavaProblemSolutions.Advanced.ExamPrep.Exam03dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car){
        if(data.size()<capacity){
            data.add(car);
        }
    }
    //not working correctly
//    public boolean buy(String manufacturer, String model){
//
//        for (int i = 0; i < data.size(); i++) {
////            Car currentCar = data.get(i);
//            if(data.get(i).getManufacturer().equals(manufacturer) &&
//                    data.get(i).getModel().equals(model)){
//                data.remove(data.get(i));
//                return true;
//            }
//        }
//        return false;
//    }

// working correctly
    public boolean buy(String manufacturer, String model){

        for (int i = 0; i < data.size(); i++) {
            Car currentCar = data.get(i);
            if(currentCar.getManufacturer().equals(manufacturer) &&
                    currentCar.getModel().equals(model)){
                data.remove(currentCar);
                return true;
            }
        }
        return false;
    }

    //working correctly
//    public boolean buy(String manufacturer, String model){
//
//        for (Car car:data) {
//
//            if(car.getManufacturer().equals(manufacturer) &&
//            car.getModel().equals(model)){
//                data.remove(car);
//                return true;
//            }
//
//        }
//
//        return false;
//    }
    public Car getLatestCar(){
        return this.data.stream().max(Comparator.comparing(Car::getYear)).orElse(null);
    }
    public Car getCar(String manufacturer, String model){
        Car c = null;
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).getManufacturer().equals(manufacturer) &&
                    data.get(i).getModel().equals(model)){
                c = data.get(i);
                return c;
            }

        }
        return c;
    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append(" The cars are in a car JavaAdvancedProjects.dealership ").append(name).append(":").append(System.lineSeparator());

        for (int i = 0; i < data.size(); i++) {
            out.append(data.get(i)).append(System.lineSeparator());
        }

        return out.toString().trim();
    }

}

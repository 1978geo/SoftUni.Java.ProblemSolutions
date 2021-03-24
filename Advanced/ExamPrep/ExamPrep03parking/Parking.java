package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    public List<Car> data;
    public String type;
    public int capacity;


    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    public void add (Car car){
        if(data.size()<capacity){
            data.add(car);
        }
    }
    public boolean remove(String manufacturer, String model){

        for (Car car: data) {

            if(car.manufacturer.equals(manufacturer) && car.model.equals(model)){
                data.remove(car);
                return true;
            }

        }
        return false;
    }

    public Car getCar(String manufacturer, String model){

        for (Car car: data) {

            if(car.manufacturer.equals(manufacturer) && car.model.equals(model)){

                return car;
            }

        }
        return null;
    }

    public Car getLatestCar(){
        Car result=null;
            for (Car car: data) {
             if(result==null || result.getYear()<car.getYear()){
                 result=car;
            }
            }
            return result;
    }
    public  int getCount(){
        return data.size();
    }

    public String  getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append("The cars are parked in ").append(this.type).append(":")
        .append(System.lineSeparator());
        for (Car car: data) {
            out.append(car.toString())
                    .append(System.lineSeparator());

        }
        return out.toString().trim();
    }
}
//
// Peugeot 307 (2011)
// Audi S4 (2005)
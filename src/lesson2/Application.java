package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("lion");
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        System.out.println("Traditional For Loop");

        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        System.out.println("Enhanced for loop");

        for(String s : animals){
            System.out.println(s);
        }

        List<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 12500, false);
        vehicles.add(vehicle2);

        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

        for(Vehicle veh : vehicles){
            System.out.println(veh);
        }

        printElements(animals);
        printElements(vehicles);

    }

    public static void printElements(List someList){
        for(int i = 0; i < someList.size(); i++){
            System.out.println(someList.get(i));
            someList.r
        }
    }
}

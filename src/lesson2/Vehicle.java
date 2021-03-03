package lesson2;

public class Vehicle {

    private String make;
    private String model;
    private int price;
    private boolean found;

    public Vehicle(String make, String model, int price, boolean found) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.found = found;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", found=" + found +
                '}';
    }


}

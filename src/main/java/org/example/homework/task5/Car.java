package org.example.homework.task5;

public class Car implements Drivable{

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive(int distance) {
        System.out.println("Машина проехала " + distance + " км");

    }


}

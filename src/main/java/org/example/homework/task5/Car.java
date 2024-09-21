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

    public void start(){
        System.out.println("Start moving");
    }

    public void stop(){
        System.out.println("Stop moving");
    }

    public void drive(int distance){
        System.out.println("Drive " + distance + "km");
    }

    public void printCar() {
        System.out.println("The car is " + this.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }


}

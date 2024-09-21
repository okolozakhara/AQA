package org.example.homework.task2;

public class Student implements Printable {
    private String name;
    private int recordBookNumber;
    private double averageScore;

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAverageScore (double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        return this.name;
    }

    public int getRecordBookNumber() {
        return this.recordBookNumber;
    }

    public double getAverageScore() {
        return this.averageScore;
    }

    @Override
    public void print() {
        System.out.println(this.name + " " + this.recordBookNumber + " " +  this.averageScore);
    }

}

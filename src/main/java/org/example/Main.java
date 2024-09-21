package org.example;

import org.example.homework.task1.Book;
import org.example.homework.task2.Student;
import org.example.homework.task3.Point;
import org.example.homework.task4.Clock;
import org.example.homework.task5.Car;
import org.example.task1.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(10000);
        account1.print();

        Book book1 = new Book();
        book1.setAuthor("Dostaevsky");
        book1.setName("Gamer");
        book1.setYearOfPublication(1866);
        book1.display();

        Student student1 = new Student();
        student1.setName("Ivanov");
        student1.setRecordBookNumber(154000);
        student1.setAverageScore(4.5);
        student1.print();

        Point point = new Point(0, 0);
        System.out.println("Начальное положение точки: " + point);

        point.moveDown(15);
        point.moveLeft(75);
        System.out.println("Положение точки после перемещения: " + point);

        Clock clock = new Clock(23, 59, 55);
        clock.readTime();
        for(int i = 0; i < 5; i++) {
            clock.tick();
            clock.readTime();
        }

        Car car = new Car("Lada", "Niva", 2020);
        car.start();
        car.drive(100);
        car.stop();


    }


}
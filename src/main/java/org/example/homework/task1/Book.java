package org.example.homework.task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int yearOfPublication;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearOfPublication (int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public void display() {
        System.out.println(this.name + " " + this.author + " " +  this.yearOfPublication);
    }

}

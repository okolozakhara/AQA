package org.example.homework.task3;

public class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp(int distance) {
        this.x += distance;
    }
    @Override
    public void moveDown(int distance) {
        this.x -= distance;
    }
    @Override
    public void moveRight(int distance) {
        this.y += distance;
    }
    @Override
    public void moveLeft(int distance) {
        this.y -= distance;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

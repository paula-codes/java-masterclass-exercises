package com.paula;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((- y) * (- y) + (- x) * (- x));
    }

    public double distance (int x2, int y2){
        return Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
    }

    public double distance (Point point){
        return Math.sqrt((point.getY() - y) * (point.getY() - y) + (point.getX() - x) * (point.getX() - x));
    }


}

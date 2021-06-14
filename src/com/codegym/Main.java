package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint (3.0f,2.5f,1.0f,2.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

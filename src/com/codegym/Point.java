package com.codegym;

public class Point {
    protected float x = 1.0f;
    protected float y = 1.0f;

    public Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY (){
        return  new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}

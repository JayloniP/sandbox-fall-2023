package com.csc205.project1;



public class Point {

    private double x;
    private double y;


  public Point(){

  }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point p2) {   //
        double x = p2.x - this.x;
        double y = p2.y - this.y;
        return Math.sqrt(x * x + y * y);
    }

    public double getX (){
      return this.x;
    }

    public void setX(double x) {

        this.x = x;
    }


    public double getY() {

        return this.y;
    }


    public void setY(double y) {

        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }


    @Override
    public String toString() {

        return "(" + this.x + ", " + this.y + ")";
    }
}





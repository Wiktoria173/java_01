package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }
  public double distance() {
    return Math.sqrt(Math.pow((this.p1.x - this.p2.),2)  + Math.pow((this.p1.y - this.p2.y),2));
  }
}

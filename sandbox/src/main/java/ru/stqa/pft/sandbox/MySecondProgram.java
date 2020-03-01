package ru.stqa.pft.sandbox;

public class MySecondProgram {
  public static void main(String[] args) {

    Point p1 = new Point(10,5);
    Point p2 = new Point(3,2);

    System.out.println("Distance equals to: " + distance(p1, p2));
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.x - p2.x),2)  + Math.pow((p1.y - p2.y),2));
  }
}

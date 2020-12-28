package ua.mainacadamy;

import ua.mainacadamy.model.Circle;
import ua.mainacadamy.model.Figure;
import ua.mainacadamy.model.Rectangle;
import ua.mainacadamy.model.Square;

public class FirstApp {
    public static double radius=3.14;

    public static void main(String[] args) {
        Circle firstCircle=new Circle();
        firstCircle.setRadius(10);
        System.out.println("circle area with radius "+firstCircle.getRadius()+" is "+firstCircle.getArea());
        Circle secondCircle=new Circle();
        secondCircle.setRadius(20);
        System.out.println("circle area with radius "+secondCircle.getRadius()+" is "+secondCircle.getArea());

        Circle lastCircle=new Circle();
        lastCircle.setRadius(radius);
        System.out.println("circle area with radius "+lastCircle.getRadius()+" is "+lastCircle.getArea());

        Rectangle rectangle=new Rectangle();
        rectangle.setSideA(10);
        rectangle.setSideB(15);
        System.out.println("Rectangle area is " + rectangle.getArea());


    }
}

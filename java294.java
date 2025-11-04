import java.util.Scanner;

abstract class Shape {
    int a, b; 
    abstract void printArea(); 
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14159 * a * a));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.printArea();

        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int h = sc.nextInt();
        Triangle t = new Triangle(base, h);
        t.printArea();

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.printArea();

        sc.close();
    }
}
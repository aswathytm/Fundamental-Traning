import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape encapsulationObject = new Shape();
        Print abstractionObject = new Print(); // abstraction
        while (true) {
            abstractionObject.list();
            encapsulationObject.setShape(sc.nextInt());
            int value = encapsulationObject.getShape();
            if (value == 1) // Finding Area of rectangle
            {
                System.out.println("Enter the Length of rectangle :");
                int length = sc.nextInt();
                System.out.println("Enter the Width of rectangle:");
                int Width = sc.nextInt();
                Rectangle rectangleObject = new Rectangle();
                rectangleObject.Area(length, Width); // Polymorphism
            }
            if (value == 2) // Finding Area of Square
            {
                System.out.println("Enter the Length of squre :");
                int length = sc.nextInt();
                Square squreObject = new Square();
                squreObject.Area(length);
            }
            if (value == 3) // Finding Area of triangle
            {
                System.out.println("Enter the Length of triangle side one :");
                int sideOne = sc.nextInt();
                System.out.println("Enter the Length of triangle side two:");
                int sideTwo = sc.nextInt();
                System.out.println("Enter the Length of triangle side three :");
                int sideThree = sc.nextInt();
                Triangle TriangleObject = new Triangle();
                TriangleObject.Area(sideOne, sideTwo, sideThree);
            }
            if (value == 4) // for exiting from program
            {
                System.exit(0);
            }
        }
    }
}
class Square {
    void Area(float side) {
        System.out.println("Area of the Square: " + side * side);
    }
}
class Rectangle {
    void Area(int l, int b) {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
class Triangle {
    void Area(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of Triangle is: " + area);
        } else {
            System.out.println("Area of Triangle not exist");
        }
    }
}
class Shape {
    private int shape; // Encapsulation
    public int getShape() {
        return shape;
    }
    public void setShape(int n) {
        this.shape = n;
    }
}
abstract class List {
    abstract void list(); // abstraction
}
class Print extends List { // inheritance
    void list() {
        System.out.println("Enter the shape to find area:");
        System.out.println("1.Rectangle\n2.square\n3.triangle\n4.exit");
    }
}
